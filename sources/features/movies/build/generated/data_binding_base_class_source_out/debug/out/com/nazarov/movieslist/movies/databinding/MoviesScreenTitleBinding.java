// Generated by view binder compiler. Do not edit!
package com.nazarov.movieslist.movies.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nazarov.movieslist.movies.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MoviesScreenTitleBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final TextView moviesScreenTitle;

  private MoviesScreenTitleBinding(@NonNull FrameLayout rootView,
      @NonNull TextView moviesScreenTitle) {
    this.rootView = rootView;
    this.moviesScreenTitle = moviesScreenTitle;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MoviesScreenTitleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MoviesScreenTitleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.movies_screen_title, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MoviesScreenTitleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.movies_screen_title;
      TextView moviesScreenTitle = ViewBindings.findChildViewById(rootView, id);
      if (moviesScreenTitle == null) {
        break missingId;
      }

      return new MoviesScreenTitleBinding((FrameLayout) rootView, moviesScreenTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
