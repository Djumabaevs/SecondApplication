package com.example.secondapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ShowGuess extends AppCompatActivity {

    private TextView showGuessedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_guess);

        showGuessedText = findViewById(R.id.received_textview);

        if(getIntent().getStringExtra("guess") != null) {
            Log.d("Stuff", " " + getIntent().getStringExtra("age"));
            showGuessedText.setText(getIntent().getStringExtra("guess"));
        }

    }
}