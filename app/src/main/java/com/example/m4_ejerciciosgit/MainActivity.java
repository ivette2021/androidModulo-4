package com.example.m4_ejerciciosgit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageButton imagen1;
    ImageButton imagen2;
    ImageButton imagen3;
    ImageButton imagen4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen1= (ImageButton) findViewById(R.id.imageButton);
        imagen2= (ImageButton) findViewById(R.id.imageButton2);
        imagen3= (ImageButton) findViewById(R.id.imageButton3);
        imagen4= (ImageButton) findViewById(R.id.imageButton4);
      imagen1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              llamar2(""+R.mipmap.instagram,""+R.color.morado);
          }
      });
        imagen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamar2(""+R.mipmap.gorjeo,""+R.color.celeste);
            }
        });
        imagen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamar2(""+R.mipmap.git,""+R.color.naranjo);
            }
        });
        imagen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamar2(""+R.mipmap.facebook1,""+R.color.azul);
            }
        });
    }

    protected  void llamar2(String image, String color){
        Intent intento =new Intent(MainActivity.this,MainActivity2.class);
        intento.putExtra("imagen",image);
        intento.putExtra("color",color);
        startActivity(intento);
    }
}