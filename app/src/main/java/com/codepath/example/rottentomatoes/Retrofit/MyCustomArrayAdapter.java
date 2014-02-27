package com.codepath.example.rottentomatoes.Retrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.codepath.example.rottentomatoes.R;
import com.codepath.example.rottentomatoes.Retrofit.Translator.RTMovie;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by mitch on 2/24/14.
 */
public class MyCustomArrayAdapter extends ArrayAdapter <RTMovie> {

    public ArrayList<RTMovie> listOfMovies;
    public final Context context;

    public MyCustomArrayAdapter(Context context , ArrayList<RTMovie> objects) {
        super(context, 0 , objects);
        this.listOfMovies = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Get the data item for this position
        RTMovie movie = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.adapter_item_box_office_movie_for_retrofit, null);
        }

        TextView title = (TextView) convertView.findViewById(R.id.titleText);
        TextView consensus = (TextView)convertView.findViewById(R.id.criticsConensusText);
        TextView criticScore = (TextView)convertView.findViewById(R.id.criticsScore);
        TextView audienceScore = (TextView)convertView.findViewById(R.id.audienceScore);
        ImageView posterImage = (ImageView)convertView.findViewById(R.id.posterImage);

        title.setText(movie.title);
        consensus.setText(movie.consensus);
        criticScore.setText("Critics Score: " +String.valueOf(movie.ratings.critics_score) );
        audienceScore.setText("Audience Score: "+String.valueOf(movie.ratings.audience_score));

        Picasso.with(getContext()).load(movie.posters.thumbnail).into(posterImage);


        return  convertView;
    }


}
