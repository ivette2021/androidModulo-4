package com.example.m4_ejerciciosgit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    Button salir;
    ImageView imagen1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intento = getIntent();
        int image= intento.getIntExtra("imagen", 0);
      int color1 = intento.getIntExtra("color",0);

                //vinculacion con los objetos
        salir= (Button) findViewById(R.id.button);

        imagen1=(ImageView) findViewById(R.id.recibido);
        //setea el recurrso de la imagen entregado en el activity 1
          imagen1.setImageResource(image);
          //setea el valor background del color, le pasamos la paleta de color que definimos en el archivo values
          imagen1.setBackgroundColor(getColor(color1));


      //  imagen1=(ImageView) findViewById(R.id.recibido);

        imagen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atras = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(atras);
            }
        });
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });
    }
}