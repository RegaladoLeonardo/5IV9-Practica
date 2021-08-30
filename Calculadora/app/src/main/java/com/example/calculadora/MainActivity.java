package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Resultados;
    String n1;
    double can1, canM,res;
    Dividir op = new Dividir();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resultados = findViewById(R.id.Resultado);


    }

    public void n2(View view){


        n1= Resultados.getText().toString() + "2";

        Resultados.setText(n1);

    }
    public void n3(View view){


        n1= Resultados.getText().toString() + "3";

        Resultados.setText(n1);

    }
    public void n4(View view){


        n1= Resultados.getText().toString() + "4";

        Resultados.setText(n1);

    }
    public void n5(View view){


        n1= Resultados.getText().toString() + "5";

        Resultados.setText(n1);

    }
    public void n6(View view){


        n1= Resultados.getText().toString() + "6";

        Resultados.setText(n1);

    }
    public void n7(View view){


        n1= Resultados.getText().toString() + "7";

        Resultados.setText(n1);

    }
    public void n8(View view){


        n1= Resultados.getText().toString() + "8";

        Resultados.setText(n1);

    }
    public void n9(View view){


        n1= Resultados.getText().toString() + "9";

        Resultados.setText(n1);

    }
    public void n0(View view){


        n1= Resultados.getText().toString() + "0";

        Resultados.setText(n1);

    }





    public void dividir(View view) {

        op.setCan1(Double.parseDouble(Resultados.getText().toString() ));


        n1= "";
        Resultados.setText(n1);
        /**
        can1 = Double.parseDouble(Resultados.getText().toString() );

        n1= "";

        Resultados.setText(n1);
        **/
    }

    public void resultado(View view) {

        op.setCanM(Double.parseDouble(Resultados.getText().toString()));


        Resultados.setText( String.valueOf(op.operacion()));


        /**
        canM = Double.parseDouble(Resultados.getText().toString());

        res = can1 / canM ;
        try {
            Resultados.setText( String.valueOf(res));
        }catch (Exception e ){
            System.out.println(e.getMessage());
            Resultados.setText(e.getMessage());
        }
        **/

    }


    public void eliminar(View view) {

        op.setCan1(0.0);
        op.setCanM(0.0);
        op.setResultado(0.0);

        can1= 0;
        canM= 0;
        res =0;

        Resultados.setText("");

    }





}