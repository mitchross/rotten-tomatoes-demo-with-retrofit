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

import butterknife.ButterKnife;
import butterknife.InjectView;

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
    public View getView(int position, View view, ViewGroup parent) {

		ViewHolder myView;

        // Get the data item for this position
        RTMovie movie = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (view == null) {

			view = LayoutInflater.from( getContext() ).inflate( R.layout.adapter_item_box_office_movie_for_retrofit, parent , false );

			myView = new ViewHolder( view );

			view.setTag( myView );


        }
		else
		{
			myView = (ViewHolder)view.getTag();
		}


        myView.title.setText(movie.title);
        myView.consensus.setText(movie.consensus);
        myView.criticScore.setText("Critics Score: " +String.valueOf(movie.ratings.critics_score) );
        myView.audienceScore.setText("Audience Score: "+String.valueOf(movie.ratings.audience_score));

        Picasso.with(getContext()).load(movie.posters.thumbnail).into(myView.posterImage);


        return  view;
    }

	protected static class ViewHolder
	{

		@InjectView( R.id.titleText )
		TextView title;

		@InjectView( R.id.criticsConensusText )
		TextView consensus;

		@InjectView( R.id.criticsScore  )
		TextView criticScore;

		@InjectView( R.id.audienceScore )
		TextView audienceScore;

		@InjectView( R.id.posterImage )
		ImageView posterImage;

		public ViewHolder ( View view )
		{
			ButterKnife.inject( this, view );
		}

	}

}
