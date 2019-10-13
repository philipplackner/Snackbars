package com.phila.snackbars;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.snackbar.Snackbar;

public class MoveViewBehaviour extends CoordinatorLayout.Behavior<View> {

    @Override
    public boolean layoutDependsOn(@NonNull CoordinatorLayout parent,
                                   @NonNull View child, @NonNull View dependency) {
        return dependency instanceof Snackbar.SnackbarLayout;
    }

    @Override
    public boolean onDependentViewChanged(@NonNull CoordinatorLayout parent,
                                          @NonNull View child, @NonNull View dependency) {
        child.setTranslationY(Math.min(0,
                dependency.getTranslationY() - dependency.getHeight()));
        return true;
    }
}
