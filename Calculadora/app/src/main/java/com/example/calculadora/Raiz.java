package com.example.calculadora;
//import javax.swing.JOptionPane;

public class Raiz extends Calculadora{

    private double resultado;

    public Raiz() {
    }

    public Raiz(double can1, double canM, double resultado) {
        super(can1, canM);
        this.resultado = resultado;
    }

    public void setResultado(double resultado) {

        this.resultado = resultado;
    }

    public double getResultado() {

        return resultado;
    }



    public double operacionz( ){

        //JOptinPane.showMessageDialog(null, getCan1());
        System.out.println(getCan1());
        //try{
            resultado = Math.sqrt(getCan1());

        /**}catch (Exception e){
            resultado = Double.parseDouble(e.getMessage());
        }

    **/

        return resultado;
    }



}
