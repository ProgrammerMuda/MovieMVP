package com.example.mvpbasic.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.mvpbasic.R;
import com.example.mvpbasic.main.MainActivity;
import com.example.mvpbasic.models.Result;

import java.util.List;

public class AdapterMovie extends RecyclerView.Adapter<AdapterMovie.MoviesHolder> {

    List<Result> movieList;
    Context context;

    public AdapterMovie(List<Result> movieList, Context context) {
        this.movieList = movieList;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterMovie.MoviesHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(context).inflate(R.layout.row_movies, viewGroup, false );
        MoviesHolder holder = new MoviesHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterMovie.MoviesHolder moviesHolder, int i) {

    moviesHolder.tvTitle.setText(movieList.get(i).getTitle());
    moviesHolder.tvOverview.setText(movieList.get(i).getOverview());
    moviesHolder.tvReleaseDate.setText(movieList.get(i).getReleaseDate());
        Glide.with(context).load("https://image.tmdb.org/t/p/w500/" + movieList.get(i).getPosterPath()).into(moviesHolder.ivMovie);

    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class MoviesHolder extends RecyclerView.ViewHolder {
        TextView tvTitle,tvOverview,tvReleaseDate;
        ImageView ivMovie;
        public MoviesHolder(@NonNull View v) {
            super(v);
            tvTitle = (TextView) v.findViewById(R.id.tvTitle);
            tvOverview = (TextView) v.findViewById(R.id.tvOverView);
            tvReleaseDate = (TextView) v.findViewById(R.id.tvReleaseDate);
            ivMovie = (ImageView) v.findViewById(R.id.ivMovie);
        }
    }
}
