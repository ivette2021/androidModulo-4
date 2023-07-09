package com.example.m4_ejerciciosgit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {//se omite el public por que es una visibilidad predeterminada ,en class en vez de extends se colocan ":"

    override fun onCreate(savedInstanceState: Bundle?) {//protected void se cambia por override fun
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
//anula el void se cambia por fun
    protected fun sumaBoton() {}
    protected fun restaBoton() {}
    protected fun divisionBoton() {}
    protected fun multiplicacionBoton() {}
}