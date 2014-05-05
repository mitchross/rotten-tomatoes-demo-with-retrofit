// Generated code from Butter Knife. Do not modify!
package com.codepath.example.rottentomatoes.Retrofit;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class BoxOfficeActivityWithRetrofit$$ViewInjector {
  public static void inject(Finder finder, final com.codepath.example.rottentomatoes.Retrofit.BoxOfficeActivityWithRetrofit target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131165245, "field 'myListView'");
    target.myListView = (android.widget.ListView) view;
    view = finder.findRequiredView(source, 2131165244, "method 'connectToService'");
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.connectToService(p0);
        }
      });
  }

  public static void reset(com.codepath.example.rottentomatoes.Retrofit.BoxOfficeActivityWithRetrofit target) {
    target.myListView = null;
  }
}
