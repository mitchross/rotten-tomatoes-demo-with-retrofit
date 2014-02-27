// Generated code from Butter Knife. Do not modify!
package com.codepath.example.rottentomatoes.Retrofit;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class BoxOfficeActivityWithRetrofit$$ViewInjector {
  public static void inject(Finder finder, final com.codepath.example.rottentomatoes.Retrofit.BoxOfficeActivityWithRetrofit target, Object source) {
    View view;
    view = finder.findById(source, 2131165245);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165245' for field 'myListView' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.myListView = (android.widget.ListView) view;
    view = finder.findById(source, 2131165244);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165244' for field 'connectButton' and method 'connectToService' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.connectButton = (android.widget.Button) view;
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
    target.connectButton = null;
  }
}
