package com.example.imdb_project_201928028;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    Context context;
    String[] movieNameList;
    int[] movieImages;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView rowName;
        ImageView rowImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            rowName = itemView.findViewById(R.id.movieNameTextView);
            rowImage = itemView.findViewById(R.id.movieImage);
        }
    }

    public MovieAdapter(Context context, String[] movieNameList, int[] movieImages){
        this.context = context;
        this.movieNameList = movieNameList;
        this.movieImages = movieImages;
    }

    @NonNull
    @Override
    public MovieAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = new LayoutInflater(context) {
            @Override
            public LayoutInflater cloneInContext(Context context) {
                return null;
            }
        };
        View view = inflater.inflate(R.layout.single_movie,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.ViewHolder holder, int position) {
        holder.rowName.setText(movieNameList[position]);
        holder.rowImage.setImageResource(movieImages[position]);
    }

    @Override
    public int getItemCount() {
        return movieNameList.length;
    }
}
