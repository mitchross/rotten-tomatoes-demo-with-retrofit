package com.codepath.example.rottentomatoes.Retrofit;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.codepath.example.rottentomatoes.R;
import com.codepath.example.rottentomatoes.Retrofit.RetrofitCore.Movies;
import com.codepath.example.rottentomatoes.Retrofit.RetrofitCore.RottenTomatoesRetrofitClient;
import com.codepath.example.rottentomatoes.Retrofit.Translator.RTMovie;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class BoxOfficeActivityWithRetrofit extends Activity {

	RottenTomatoesRetrofitClient.RottenTomatoesService rottenTomatoesService;
	RestAdapter restAdapter;

    @InjectView(R.id.myListView)
    ListView myListView;

    @OnClick(R.id.connectButton)
    public void connectToService(View v)
    {
        rottenTomatoesService.getMoviesFromServer(new RottenTomatoesMoviesResponseHandler() );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_box_office_activity_with_retrofit);
        ButterKnife.inject(this);
		setUpRetroFit();


    }

	protected void setUpRetroFit()
	{
		 restAdapter = new RestAdapter.Builder().setEndpoint(RottenTomatoesRetrofitClient.API_BASE_URL).build();
		 rottenTomatoesService = restAdapter.create(RottenTomatoesRetrofitClient.RottenTomatoesService.class);
	}

    public class RottenTomatoesMoviesResponseHandler implements Callback<Movies>
    {
        ArrayList<RTMovie> myMovies = new ArrayList<RTMovie>();
        MyCustomArrayAdapter adapter = new MyCustomArrayAdapter(getApplicationContext() , myMovies);

        @Override
        public void success(Movies movies, Response response) {
            Log.d( "test" ," we made it");

            for(RTMovie aMovie : movies.moviesFromJSONToJavaList)
            {
                adapter.add( aMovie );
            }
            myListView.setAdapter(adapter);
        }

        @Override
        public void failure(RetrofitError retrofitError) {

        }
    }


}
