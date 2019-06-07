package com.example.hellokitty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mHelloTextViev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHelloTextViev = findViewById(R.id.textView);

    }

    public void onButtonPressed(View view) {
        mHelloTextViev.setText("Hello Ritty!");
    }
}
