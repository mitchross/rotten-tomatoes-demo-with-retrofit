// Generated code from Butter Knife. Do not modify!
package com.codepath.example.rottentomatoes.Retrofit;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MyCustomArrayAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final com.codepath.example.rottentomatoes.Retrofit.MyCustomArrayAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131165254, "field 'title'");
    target.title = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131165255, "field 'consensus'");
    target.consensus = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131165256, "field 'criticScore'");
    target.criticScore = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131165257, "field 'audienceScore'");
    target.audienceScore = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131165253, "field 'posterImage'");
    target.posterImage = (android.widget.ImageView) view;
  }

  public static void reset(com.codepath.example.rottentomatoes.Retrofit.MyCustomArrayAdapter.ViewHolder target) {
    target.title = null;
    target.consensus = null;
    target.criticScore = null;
    target.audienceScore = null;
    target.posterImage = null;
  }
}
