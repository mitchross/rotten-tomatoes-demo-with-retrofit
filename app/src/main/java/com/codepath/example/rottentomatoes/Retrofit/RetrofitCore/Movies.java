package com.codepath.example.rottentomatoes.Retrofit.RetrofitCore;

import com.codepath.example.rottentomatoes.Retrofit.Translator.RTMovie;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mitch on 2/24/14.
 */
public class Movies {

    @SerializedName("movies")
    public ArrayList<RTMovie> moviesFromJSONToJavaList;

}
