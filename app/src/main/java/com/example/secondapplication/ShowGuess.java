package com.example.secondapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ShowGuess extends AppCompatActivity {

    private TextView showGuessedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_guess);

        showGuessedText = findViewById(R.id.received_textview);

        Bundle extra = getIntent().getExtras();

        if(extra != null) {
            Log.d("Extra", " " +  extra.getInt("age"));
            showGuessedText.setText(extra.getString("guess"));
        }

        showGuessedText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                intent.putExtra("message back", "From second activity");
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        /*if(getIntent().getStringExtra("guess") != null) {
            Log.d("Stuff", " " + getIntent().getStringExtra("age"));
            showGuessedText.setText(getIntent().getStringExtra("guess"));
        }*/

    }
}