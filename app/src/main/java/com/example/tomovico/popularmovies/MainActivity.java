package com.example.tomovico.popularmovies;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity
        implements LoaderManager.LoaderCallbacks<List<Movie>> {

    public static final int LOADER_MANAGER_ID = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportLoaderManager().initLoader(LOADER_MANAGER_ID, null, this);

    }

    @NonNull
    @Override
    public Loader<List<Movie>> onCreateLoader(int i, @Nullable Bundle bundle) {
        return new MovieLoader(MainActivity.this);
    }

    @Override
    public void onLoadFinished(@NonNull Loader<List<Movie>> loader, List<Movie> listOfMovies) {
        // setting loaded data an dapter
        TextView textView = (TextView) findViewById(R.id.ispisTV);

        // Looping through film list
        for (Movie movie : listOfMovies) {
            textView.append(movie.getOriginal_title() + '\n');
        }
    }

    @Override
    public void onLoaderReset(@NonNull Loader<List<Movie>> loader) {
        // setting empty data an dapter
    }
}
