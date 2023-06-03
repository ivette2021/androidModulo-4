package com.example.m4_ejerciciosgit;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//se cargo el diseño de archivo xml

        TextView editText1 = findViewById(R.id.numero_1);//busca el elemento text view con un id especifico
        TextView editText2 = findViewById(R.id.numero_2);
        TextView resultado = findViewById(R.id.result);
        Button button1 = findViewById(R.id.suma);
        Button button2 = findViewById(R.id.resta);
        Button button3 = findViewById(R.id.division);
        Button button4 = findViewById(R.id.multiplicacion);
        Button button5 = findViewById(R.id.salir);
        //proceso
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1 = editText1.getText().toString();
                String num2 = editText2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("Campo inválido")
                            .setMessage("Por favor, ingrese todos los valores.")
                            .setPositiveButton("Aceptar", null)
                            .show();
                }else {
                    int resul = Integer.parseInt(num1) + Integer.parseInt(num2);
                    resultado.setText("El resultado es " + resul);
                    editText1.setText("");
                    editText2.setText("");
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1 = editText1.getText().toString();
                String num2 = editText2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("Campo inválido")
                            .setMessage("Por favor, ingrese todos los valores.")
                            .setPositiveButton("Aceptar", null)
                            .show();
                }else {
                    int resul = Integer.parseInt(num1) - Integer.parseInt(num2);
                    resultado.setText("El resultado es " + resul);
                    editText1.setText("");
                    editText2.setText("");
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1 = editText1.getText().toString();
                String num2 = editText2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("Campo inválido")
                            .setMessage("Por favor, ingrese todos los valores.")
                            .setPositiveButton("Aceptar", null)
                            .show();
                }else {
                    int resul = Integer.parseInt(num1) / Integer.parseInt(num2);
                    resultado.setText("El resultado es " + resul);
                    editText1.setText("");
                    editText2.setText("");
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1 = editText1.getText().toString();
                String num2 = editText2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("Campo inválido")
                            .setMessage("Por favor, ingrese todos los valores.")
                            .setPositiveButton("Aceptar", null)
                            .show();
                }else {
                    int resul = Integer.parseInt(num1) * Integer.parseInt(num2);
                    resultado.setText("El resultado es " + resul);
                    editText1.setText("");
                    editText2.setText("");
                }
            }
        });
        // se crea el boton para cerrar aplicacion
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
