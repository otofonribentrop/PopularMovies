package com.example.tomovico.popularmovies;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<Movie> testData() {
        List<Movie> testListOfFilms = new ArrayList<Movie>();
        testListOfFilms.add(new Movie(1, "Test Film 1"));

        return testListOfFilms;

    }
}
