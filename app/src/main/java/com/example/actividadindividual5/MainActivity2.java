package com.example.actividadindividual5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

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
           mBinding.nombre.setText(intent.getStringExtra("Nombre"));
           mBinding.apellido.setText(intent.getStringExtra("Apellido"));
           mBinding.emailAddress.setText(intent.getStringExtra("Correo"));
           }
    }
}

