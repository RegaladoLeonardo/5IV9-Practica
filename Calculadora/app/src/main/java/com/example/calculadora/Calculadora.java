package com.example.calculadora;

public class Calculadora {

    private double can1, canM ;

    public Calculadora(){

    }

    public Calculadora( double can1, double canM){

        this.can1 = can1;
        this.canM = canM;
    }

    public double getCan1() {
        return can1;
    }

    public void setCan1(double can1) {
        this.can1 = can1;
    }

    public double getCanM() {
        return canM;
    }

    public void setCanM(double canM) {
        this.canM = canM;
    }



}
