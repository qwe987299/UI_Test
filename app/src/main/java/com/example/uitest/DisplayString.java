package com.example.uitest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DisplayString extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_display_string);
        TextView showStringTV = (TextView) findViewById(R.id.showString);
        showStringTV.setText("Test");
    }
}
