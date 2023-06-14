package com.example.actividadindividual5;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.actividadindividual5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btnAirplaneMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Modo Avión");
            }
        });

        binding.btnUpdateProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Actualizar Perfil");
            }
        });

        binding.btnSaveImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Guardar en Galería");
            }
        });

        binding.btnLevelCompleted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Nivel 4 Completado");
            }
        });

        binding.btnPausedMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Música Pausada");
            }
        });

        binding.btnLevelUnlocked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Nivel 5 Desbloqueado");
            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
