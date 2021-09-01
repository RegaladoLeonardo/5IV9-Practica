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
public class Teclas implements Serializable{
    
    private String resultado="";
    private String codigo="";
    String letras[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    String pulso[]={"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
    
    //private String cadena[] = codigo.split(" ");

    /**
    Teclas(String frase, String resultado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Teclas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    **/
    
    public void Teclas(){
        
    }

    public void Teclas(String resultado, String codigo) {
        this.resultado = resultado;
        this.codigo = codigo;
    }
    

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    
    public String convertir( String[] cadena, String clave){
        /**
        for(int i=0; i<cadena.length; i++){
            
            System.out.println(cadena[i]);
            
        }
        **/
        
        for(int i = 0; i<cadena.length; i++){
            
            
            for(int k=0 ; k <pulso.length; k++){
                
                if(cadena[i].equals(pulso[k])){   
            
                    
                    this.resultado = this.resultado + letras[k];
                    
                }
            }
            
        }
        
        this.codigo = clave;
        
        
        System.out.println("EN EL METODO CONVERTIR:   "+ this.resultado);
        System.out.println("En el metodo resultado " + this.codigo);
        
        return resultado;   
    }
    
    
}
