package com.example.manejodeactividades_dos;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityUsuario extends AppCompatActivity {

    TextView textViewBienvenido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);
        textViewBienvenido = findViewById(R.id.textViewBienvenido);

        String nombreString = "";

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            nombreString = extras.getString("nombre");
        }
        textViewBienvenido.setText("Bienvenido " + nombreString);
    }

    // Para el boton de Atrás, se crearia un nuevo Intent, pero yo prefiero dejarlo con la flecha (Manifest)

}
