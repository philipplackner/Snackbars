package com.phila.snackbars;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class CustomMovableButton extends AppCompatButton
        implements CoordinatorLayout.AttachedBehavior {

    public CustomMovableButton(Context context) {
        super(context);
    }

    public CustomMovableButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomMovableButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @NonNull
    @Override
    public CoordinatorLayout.Behavior getBehavior() {
        return new MoveViewBehaviour();
    }
}
