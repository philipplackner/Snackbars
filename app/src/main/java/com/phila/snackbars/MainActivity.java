package com.phila.snackbars;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnShowSnackbar = findViewById(R.id.btnShowSnackbar);
        final Snackbar snackbar = Snackbar.make(btnShowSnackbar,
                "Hello, I'm a cute snackbar!", Snackbar.LENGTH_INDEFINITE);
        snackbar.setAction("GTFO", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snackbar.dismiss();
            }
        });

        btnShowSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snackbar.show();
            }
        });
    }
}
