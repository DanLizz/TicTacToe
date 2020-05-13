package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LandingActivity extends AppCompatActivity {

    private ImageButton button_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        button_start = findViewById(R.id.button_start);

        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityGame();
            }
        });
    }

    public void openActivityGame(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
