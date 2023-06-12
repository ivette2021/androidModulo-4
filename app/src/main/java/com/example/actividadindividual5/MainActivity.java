package com.example.actividadindividual5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.actividadindividual5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    //definimos la variable binding
    private ActivityMainBinding mBinding; //declaro variable binding
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //vista binding
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        // mBinding.nombre.setText("ivette"); ejemplo para setear algo en particular

        //mandar datos de una pantalla a otra
        mBinding.registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mBinding.nombre.getText().toString();
                String lastname = mBinding.apellido.getText().toString();
                String email = mBinding.emailAddress.getText().toString();
                String password = mBinding.password.getText().toString();
                Log.d("Prueba", "" + name + "" + lastname + "" + email);
                passsecond(name,lastname,email,password);
            }
        });
    }
    private void passsecond(String name, String lastname, String email, String password) {
        //donde estoy y donde voy
        if((!name.isEmpty()) && (!lastname.isEmpty()) && (!email.isEmpty()) && (!password.isEmpty())){
            Intent passSecond = new Intent(MainActivity.this,MainActivity2.class);
            Log.d("Prueba", "" +name+ "" +lastname + "" +email);

            passSecond.putExtra("Nombre", name);
            passSecond.putExtra("Apellido", lastname);
            passSecond.putExtra("Correo", email);
            startActivity(passSecond);
        }

        if(name.length() == 0){
            Toast.makeText(this,"rellenar campo obligartorio", Toast.LENGTH_LONG).show();
        }
        if(lastname.length() == 0){
            Toast.makeText(this,"rellenar campo obligartorio", Toast.LENGTH_LONG).show();
        }
        if(email.length() == 0){
            Toast.makeText(this,"rellenar campo obligartorio", Toast.LENGTH_LONG).show();
        }
        if(password.length() == 0){
            Toast.makeText(this,"rellenar campo obligartorio", Toast.LENGTH_LONG).show();
        }
        if(name.length() != 0 && lastname.length() != 0 && email.length() != 0 && password.length() != 0){
            Toast.makeText(this,"registro en proceso...", Toast.LENGTH_LONG).show();
        }


    }

}