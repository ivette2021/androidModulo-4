package com.example.m4_ejerciciosgit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    Button volver;
    ImageView imagen1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intento = getIntent();
        String image= intento.getStringExtra("imagen");
        String color1 = intento.getStringExtra("color");
                //vinculacion con los objetos
        volver= (Button) findViewById(R.id.button);
        imagen1=(ImageView) findViewById(R.id.recibido);

        imagen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atras = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(atras);
            }
        });
    }
}