package com.example.manejodeactividades_dos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextNombreEdad, editTextEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verMenuPersona(View view) {
        editTextNombreEdad = findViewById(R.id.editTextNombreEdad);
        editTextEdad = findViewById(R.id.editTextEdad);

        if (editTextNombreEdad.getText().toString().trim().length() > 0 && editTextEdad.getText().toString().trim().length() > 0) {
            Intent intent = new Intent(MainActivity.this, ActivityEdadUsuario.class);
            intent.putExtra("nombre", editTextNombreEdad.getText().toString());
            intent.putExtra("edad", editTextEdad.getText().toString());
            startActivity(intent);

        } else {
            Toast.makeText(this, "Algún campo esta vacio", Toast.LENGTH_SHORT).show();
        }
    }

    public void verMenuInfo(View view) {
        Intent intent = new Intent(MainActivity.this, ActivityFormulario.class);
        startActivity(intent);
    }
}