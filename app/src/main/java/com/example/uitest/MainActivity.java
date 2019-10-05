package com.example.uitest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
    }
    public void sendString(View view) {

        //((Button) view).setText("OK");

        Intent intent = new Intent(this, DisplayString.class);
        EditText editText = (EditText) findViewById(R.id.inputString);
        EditText editText2 = (EditText) findViewById(R.id.inputString2);
        String string2send = editText.getText().toString();
        String string2send2 = editText2.getText().toString();
        String result = string2send + string2send2;
        intent.putExtra("userInputString", result);
        startActivity(intent);

    }
}
