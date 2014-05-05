package com.codepath.example.rottentomatoes.Retrofit.RetrofitCore;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by mitch on 2/24/14.
 */
public class RottenTomatoesRetrofitClient {


    public static final String API_KEY = "snvygxnkhe8aa7jw8c3ktx5v";
    public static final String API_BASE_URL = "http://api.rottentomatoes.com/api/public/v1.0/";
    //http://api.rottentomatoes.com/api/public/v1.0/lists/movies/box_office.json?apikey=<key>

    public interface RottenTomatoesService
    {
        @GET("/lists/movies/box_office.json?apikey=sb57xwg3r6qp6zvwnzm463jv")
        void getMoviesFromServer(
                Callback<Movies> callback );
    }



}
