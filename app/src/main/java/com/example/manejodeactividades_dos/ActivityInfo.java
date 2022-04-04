package com.example.manejodeactividades_dos;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityInfo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }
    // Para el boton de Atrás, se crearia un nuevo Intent, pero yo prefiero dejarlo con la flecha (Manifest)
}
