package com.example.m4_ejerciciosgit;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View parentLayout = findViewById(android.R.id.content);
        Snackbar.make(parentLayout, "¡Bienvenido!", Snackbar.LENGTH_LONG).show();
    }
}
