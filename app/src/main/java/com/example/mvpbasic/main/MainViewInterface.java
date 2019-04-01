package com.example.mvpbasic.main;

import com.example.mvpbasic.models.MovieResponse;

public interface MainViewInterface {
    void showToast(String s);
    void showProgressBar();
    void hideProgressBar();
    void displayMovies(MovieResponse movieResponse);
    void displayError(String s);
}
