package com.example.tomovico.popularmovies;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.AsyncTaskLoader;

import java.util.ArrayList;
import java.util.List;

public class MovieLoader extends AsyncTaskLoader<List<Movie>> {
    public MovieLoader(@NonNull Context context) {
        super(context);
    }

    @Nullable
    @Override
    public List<Movie> loadInBackground() {

        return Utils.testData();
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }
}
