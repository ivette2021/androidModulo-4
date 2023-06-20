package com.example.m4_ejerciciosgit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button platos = findViewById(R.id.home);
        Button ubicacion = findViewById(R.id.location);
        Button salida = findViewById(R.id.exit);

        salida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

           finishAndRemoveTask();
            }
        });
        ubicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
            }
        });
        platos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //iconos
            /*

             */
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

    }

}