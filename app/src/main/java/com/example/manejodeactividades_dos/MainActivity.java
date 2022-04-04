package com.example.manejodeactividades_dos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextNombre, editTextPassw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verMenuPersona(View view){
        editTextNombre = findViewById(R.id.editTextNombre);
        editTextPassw = findViewById(R.id.editTextPassw);

        if (editTextNombre.getText().toString().trim().length() > 0 && editTextPassw.getText().toString().trim().equals("Perico1")) {
            Intent intent = new Intent(MainActivity.this, ActivityUsuario.class);
            intent.putExtra("nombre", editTextNombre.getText().toString());
            startActivity(intent);
            editTextPassw.setText("");

        } else {
            Toast.makeText(this, "Algún campo esta vacio o contraseña incorrecta", Toast.LENGTH_SHORT).show();
        }
    }

    public void verMenuInfo(View view){
        Intent intent = new Intent(MainActivity.this, ActivityInfo.class);
        startActivity(intent);
    }
}