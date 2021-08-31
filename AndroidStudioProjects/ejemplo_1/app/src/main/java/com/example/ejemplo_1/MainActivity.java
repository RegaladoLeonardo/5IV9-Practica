package com.example.ejemplo_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextA; //AQUI SE GUARDA O QUE ESTE EN LA CJA DE TEXTO
    private EditText editTextB;
    private TextView tVResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextA = findViewById(R.id.editTextNumberA);
        editTextB = findViewById(R.id.editTextNumberB);

        tVResultado = findViewById(R.id.textViewResultado);



    }


    public void sumar(View view){
        int operacion = Integer.parseInt(editTextA.getText().toString()) + Integer.parseInt(editTextB.getText().toString());
        tVResultado.setText(operacion+"");
    }

    public void restar(View view){
        int operacion = Integer.parseInt(editTextA.getText().toString()) - Integer.parseInt(editTextB.getText().toString());
        tVResultado.setText(operacion+"");
    }

    public void multiplicar(View view){
        int operacion = Integer.parseInt(editTextA.getText().toString()) * Integer.parseInt(editTextB.getText().toString());
        tVResultado.setText(operacion+"");
    }

    public void dividir(View view){
        int operacion = Integer.parseInt(editTextA.getText().toString()) / Integer.parseInt(editTextB.getText().toString());
        tVResultado.setText(operacion+"");
    }

}