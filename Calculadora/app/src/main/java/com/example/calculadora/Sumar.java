package com.example.calculadora;

public class Sumar extends Calculadora {

    private double resultado;

    public Sumar() {
    }

    public Sumar(double can1, double canM, double resultado) {
        super(can1, canM);
        this.resultado = resultado;
    }

    public void setResultado(double resultado) {

        this.resultado = resultado;
    }

    public double getResultado() {

        return resultado;
    }



    public double operacionS( ){

            resultado =  getCan1() + getCanM() ;


        return resultado;
    }



}
