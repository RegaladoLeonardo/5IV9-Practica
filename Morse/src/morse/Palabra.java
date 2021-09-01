/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse;

import java.io.Serializable;

/**
 *
 * @author levar
 */
public class Palabra implements Serializable{
    
 
    private String text;
    private String resultado ;
    
    //tamano = tamano.length();
    
    public Palabra(){
        
    }

    public Palabra(String text, String resultado) {
        
        this.resultado = resultado;
        this.text = text;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    
    
    public String inverso(){
        
        
        StringBuilder bpalabra = new StringBuilder(text);
        resultado = bpalabra.reverse().toString();
        
        
        
        return resultado;
    }
    
 
}