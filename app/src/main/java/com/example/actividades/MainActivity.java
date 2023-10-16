package com.example.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.sql.Array;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad12_linear_layout);

        final Button botonReset = findViewById(R.id.buttonReset);

        final Button botonAcceptar = findViewById(R.id.buttonAccept);

        final CheckBox chbox1 = findViewById(R.id.checkbox1);
        final CheckBox chbox2 = findViewById(R.id.checkbox2);
        final CheckBox chbox3 = findViewById(R.id.checkbox3);
        final CheckBox chbox4 = findViewById(R.id.checkbox4);
        final CheckBox chbox5 = findViewById(R.id.checkbox5);
        final CheckBox chbox6 = findViewById(R.id.checkbox6);
        final CheckBox chbox7 = findViewById(R.id.checkbox7);
        final CheckBox chbox8 = findViewById(R.id.checkbox8);

        final RadioGroup radGroup1 = findViewById(R.id.grupoGenero);
        final RadioGroup radGroup2 = findViewById(R.id.grupoDeporte);


        final TextView resultado = findViewById(R.id.lblResultado);

        botonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chbox1.setChecked(false);
                chbox2.setChecked(false);
                chbox3.setChecked(false);
                chbox4.setChecked(false);
                chbox5.setChecked(false);
                chbox6.setChecked(false);
                chbox7.setChecked(false);
                chbox8.setChecked(false);

                radGroup1.clearCheck();
                radGroup2.clearCheck();

                resultado.setText("");
            }
        });

        botonAcceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] listaAficiones = new String[8];

                if (chbox1.isChecked()){
                    listaAficiones[0] = chbox1.getText().toString();
                }
                if (chbox2.isChecked()){
                    listaAficiones[1] = chbox2.getText().toString();
                }
                if (chbox3.isChecked()){
                    listaAficiones[2] = chbox3.getText().toString();
                }
                if (chbox4.isChecked()){
                    listaAficiones[3] = chbox4.getText().toString();
                }
                if (chbox5.isChecked()){
                    listaAficiones[4] = chbox5.getText().toString();
                }
                if (chbox6.isChecked()){
                    listaAficiones[5] = chbox6.getText().toString();
                }
                if (chbox7.isChecked()){
                    listaAficiones[6] = chbox7.getText().toString();
                }
                if (chbox8.isChecked()){
                    listaAficiones[7] = chbox8.getText().toString();
                }


                for (int i = 0; i < listaAficiones.length; i++){
                    if (listaAficiones[i] != null){
                        resultado.setText(resultado.getText() + "\n" +listaAficiones[i]);
                    }
                }

                RadioButton radioBoton = findViewById(radGroup1.getCheckedRadioButtonId());
                String cadena = radioBoton.getText().toString();
                resultado.setText(resultado.getText()+ "\n" + cadena);
                radioBoton = findViewById(radGroup2.getCheckedRadioButtonId());
                cadena = radioBoton.getText().toString();
                resultado.setText(resultado.getText()+ "\n" + cadena);

            }
        });


    }


    







}