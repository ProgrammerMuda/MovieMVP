package com.example.mvpbasic.search;

import android.support.v7.widget.SearchView;

/**
 * Created by anujgupta on 27/12/17.
 */

public interface SearchPresenterInterface {

    void getResultsBasedOnQuery(SearchView searchView);
}
