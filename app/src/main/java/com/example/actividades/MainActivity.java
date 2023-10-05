package com.example.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad10_linear_layout);

        //Defino los textos a borrar

        final EditText nombreEditText = findViewById(R.id.editTextNombre);

        final EditText claveEditText = findViewById(R.id.editTextClave);

        //Defino el boton
        final Button resetButton = findViewById(R.id.resetButton);

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreEditText.setText("");
                claveEditText.setText("");
            }
        });
    }





}