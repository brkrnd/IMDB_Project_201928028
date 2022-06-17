package com.example.imdb_project_201928028;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IMDB_Starting_Menu extends AppCompatActivity {

    private Button startButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imdb_starting_menu);

        startButton = findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWatchList();
            }
        });
    }
    public void openWatchList(){
        Intent intent = new Intent(this, MovieList.class);
        startActivity(intent);
    }
}