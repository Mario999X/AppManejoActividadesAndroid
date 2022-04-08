package com.example.manejodeactividades_dos;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityEdadUsuario extends AppCompatActivity {

    TextView textViewNombreIntr, textViewEdadIntr, textViewResultado;
    ImageView imageViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edad_usuario);
        textViewNombreIntr = findViewById(R.id.textViewNombreIntr);
        textViewEdadIntr = findViewById(R.id.textViewEdadIntr);
        textViewResultado = findViewById(R.id.textViewResultado);
        imageViewResultado = findViewById(R.id.imageViewResultado);

        String nombreString = "";
        String edad = "";

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            nombreString = extras.getString("nombre");
            edad = extras.getString("edad");
        }
        textViewNombreIntr.setText("Nombre: " + nombreString);
        textViewEdadIntr.setText("Edad: " + edad);

        if (Integer.parseInt(edad) >= 18) {
            textViewResultado.setText("Resultado: Mayor de edad.");
            imageViewResultado.setImageResource(R.drawable.imagen_mayor);
        } else {
            textViewResultado.setText("Resultado: Menor de edad.");
            imageViewResultado.setImageResource(R.drawable.imagen_menor);
        }

    }

    // Para el boton de Atrás, se crearia un nuevo Intent, pero yo prefiero dejarlo con la flecha (Manifest)

}
