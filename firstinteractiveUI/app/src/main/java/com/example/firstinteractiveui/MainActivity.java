package com.example.firstinteractiveui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int counter = 0;
    Button toastBtn;
    Button clickBtn;
    TextView counterTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toastBtn = findViewById(R.id.toast_btn);
        clickBtn = findViewById(R.id.click_btn);
        counterTextView = findViewById(R.id.counter_textView);

        toastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hello", Toast.LENGTH_LONG).show();
            }
        });

        clickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                counterTextView.setText(Integer.toString(counter));
            }
        });


    }


}