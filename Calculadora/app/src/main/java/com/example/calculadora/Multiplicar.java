package com.example.calculadora;

public class Multiplicar extends Calculadora {

    private double resultado;

    public Multiplicar() {
    }

    public Multiplicar(double can1, double canM, double resultado) {
        super(can1, canM);
        this.resultado = resultado;
    }

    public void setResultado(double resultado) {

        this.resultado = resultado;
    }

    public double getResultado() {

        return resultado;
    }



    public double operacionm( ){

        resultado =  getCan1() * getCanM() ;


        return resultado;
    }



}

