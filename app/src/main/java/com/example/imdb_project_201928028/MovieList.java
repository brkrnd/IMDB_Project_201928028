package com.example.imdb_project_201928028;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MovieList extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter movieAdapter;
    RecyclerView.LayoutManager layoutManager;

    String[] movieList = {

    };

    int[] movieImages = {

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);

        recyclerView = findViewById(R.id.recyclerViewMovies);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        movieAdapter = new MovieAdapter(this, movieList, movieImages);
        recyclerView.setAdapter(movieAdapter);
    }
}