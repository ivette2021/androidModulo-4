package com.example.actividadindividual5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.actividadindividual5.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {
 private ActivityMain2Binding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mBinding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

         Intent intent = getIntent();
         Log.d("Prueba Activity2", intent.getStringExtra("Nombre"));

        if(intent!=null) {
           mBinding.txt1.setText(intent.getStringExtra("Nombre"));
           mBinding.txt2.setText(intent.getStringExtra("Apellido"));
           mBinding.txt3.setText(intent.getStringExtra("Correo"));
           }

    }
    //metodo boton volver
    public void Volver(View v){
        Intent volver = new Intent(this,MainActivity.class);
        startActivity(volver);
    }
}

