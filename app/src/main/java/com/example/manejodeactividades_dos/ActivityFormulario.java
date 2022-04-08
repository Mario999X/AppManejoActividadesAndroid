package com.example.manejodeactividades_dos;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityFormulario extends AppCompatActivity {

    EditText editTextNombre, editTextApellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
    }

    public void mandarInfoFalso(View view) {
        editTextNombre = findViewById(R.id.editTextNombre);
        editTextApellido = findViewById(R.id.editTextApellido);

        if (editTextNombre.getText().toString().trim().length() > 0 && editTextApellido.getText().toString().trim().length() > 0) {
            editTextNombre.setText("");
            editTextApellido.setText("");
            Toast.makeText(this, "Información enviada con éxito", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "Algún campo esta vacio", Toast.LENGTH_SHORT).show();
        }
    }

    // Para el boton de Atrás, se crearia un nuevo Intent, pero yo prefiero dejarlo con la flecha (Manifest)
}
