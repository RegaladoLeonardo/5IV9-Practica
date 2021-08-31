package com.example.calculadora;

public class Potencia extends Calculadora{

    private double resultado;

    public Potencia() {
    }

    public Potencia(double can1, double canM, double resultado) {
        super(can1, canM);
        this.resultado = resultado;
    }

    public void setResultado(double resultado) {

        this.resultado = resultado;
    }

    public double getResultado() {

        return resultado;
    }



        public double operacionp( ){

            try{
                resultado = Math.pow(getCan1(), getCanM());
            }catch (Exception e){
                resultado = Double.parseDouble(e.getMessage());
            }

            return resultado;
        }



}


