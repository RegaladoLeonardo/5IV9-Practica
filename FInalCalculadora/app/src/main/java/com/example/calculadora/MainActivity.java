package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Resultados ;
    String n1;
    double can1, canM,res;
    Dividir op = new Dividir();
    Sumar ops = new Sumar();
    Restar opr = new Restar();
    Multiplicar opm = new Multiplicar();
    Potencia opp = new Potencia();
    Raiz opz = new Raiz();

    String option;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //if(String.valueOf(R.id.Resultado) == "0"){
        //    Resultados.setText("0");
        //}else{
        Resultados = findViewById(R.id.Resultado);
        //}



    }

    public void n1(View view){


        n1= Resultados.getText().toString() + "1";

        Resultados.setText(n1);

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


        if(Resultados.getText().toString().equals("")) {

            Resultados.setText("0");
            op.setCan1(Double.parseDouble(Resultados.getText().toString()));

            option = "/";

            n1 = "";
            Resultados.setText(n1);
        }else{

            op.setCan1(Double.parseDouble(Resultados.getText().toString()));

            option = "/";

            n1 = "";
            Resultados.setText(n1);
        }


    }


    public void Sumar(View view){

        if(Resultados.getText().toString().equals("")) {

            Resultados.setText("0");

            ops.setCan1(Double.parseDouble(Resultados.getText().toString()));

            option = "+";

            n1 = "";
            Resultados.setText(n1);
        }else{

            ops.setCan1(Double.parseDouble(Resultados.getText().toString()));

            option = "+";

            n1 = "";
            Resultados.setText(n1);

        }


    }

    public void Potencia(View view){

        if(Resultados.getText().toString().equals("")) {

            Resultados.setText("0");

            opp.setCan1(Double.parseDouble(Resultados.getText().toString()));

            option = "^";

            n1 = "";
            Resultados.setText(n1);
        }else{

            opp.setCan1(Double.parseDouble(Resultados.getText().toString()));

            option = "^";

            n1 = "";
            Resultados.setText(n1);

        }


    }


    public void Raiz(View view){

        if(Resultados.getText().toString().equals("")) {

            Resultados.setText("0");

            opz.setCan1(Double.parseDouble(Resultados.getText().toString()));

            option = "r";

            n1 = "";
            Resultados.setText(n1);
        }else{

            opz.setCan1(Double.parseDouble(Resultados.getText().toString()));

            option = "r";

            n1 = "";
            Resultados.setText(n1);

        }


    }

    public void Restar(View view){

        if(Resultados.getText().toString().equals("")) {

            Resultados.setText("0");
            opr.setCan1(Double.parseDouble(Resultados.getText().toString() ));

            option = "-";

            n1= "";
            Resultados.setText(n1);
        }else{

            opr.setCan1(Double.parseDouble(Resultados.getText().toString() ));

            option = "-";

            n1= "";
            Resultados.setText(n1);
        }


    }

    public void Multiplicar(View view){

        if(Resultados.getText().toString().equals("")) {

            Resultados.setText("0");

            opm.setCan1(Double.parseDouble(Resultados.getText().toString() ));

            option = "*";

            n1= "";
            Resultados.setText(n1);

        }else{

            opm.setCan1(Double.parseDouble(Resultados.getText().toString() ));

            option = "*";

            n1= "";
            Resultados.setText(n1);

        }

        /**
        opm.setCan1(Double.parseDouble(Resultados.getText().toString() ));

        option = "*";

        n1= "";
        Resultados.setText(n1);
         **/

    }


    public void Borrar( View view){


        if(Resultados.getText().toString().equals("")) {

            Resultados.setText("0");

            n1 = Resultados.getText().toString();
            n1 = n1.substring(0, n1.length() - 1);

            Resultados.setText(n1);
        }else{

            n1 = Resultados.getText().toString();
            n1 = n1.substring(0, n1.length() - 1);

            Resultados.setText(n1);

        }
    }




    public void resultado(View view) {



        if(Resultados.getText().toString().equals("")) {

            Resultados.setText("0");
            if(option.equals("r")){
                Resultados.setText(String.valueOf(opz.operacionz()));
            }

        }else{
            if (option.equals("/")) {

                op.setCanM(Double.parseDouble(Resultados.getText().toString()));

                Resultados.setText(String.valueOf(op.operacion()));

            } else if (option.equals("+")) {

                ops.setCanM(Double.parseDouble(Resultados.getText().toString()));
                Resultados.setText(String.valueOf(ops.operacionS()));

            } else if (option.equals("-")) {

                opr.setCanM(Double.parseDouble(Resultados.getText().toString()));
                Resultados.setText(String.valueOf(opr.operacionr()));

            } else if (option.equals("*")) {

                opm.setCanM(Double.parseDouble(Resultados.getText().toString()));
                Resultados.setText(String.valueOf(opm.operacionm()));

            }else if(option.equals("^")){
                opp.setCanM(Double.parseDouble(Resultados.getText().toString()));
                Resultados.setText(String.valueOf(opp.operacionp()));

            }else if(option.equals("r")){

                Resultados.setText(String.valueOf(opz.operacionz()));
            }
        }

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