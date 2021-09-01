/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse;

/**
 *
 * @author levar
 */
public class Codigo { 

     private String Letras[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
     private String Cmorse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
     private int tamano[] = {2,4,4,3,1,4,3,4,2,4,3,4,2,2,3,4,4,3,3,1,3,4,3,4,4,4};

     String Cpalabra="";
     

    public Codigo() {
    }
    
    public Codigo(String Cpalabra){
        this.Cpalabra = Cpalabra;
        
    }
    

    public String[] getLetras() {
        return Letras;
    }

    public void setLetras(String[] Letras) {
        this.Letras = Letras;
    }

    public String[] getCmorse() {
        return Cmorse;
    }

    public void setCmorse(String[] Cmorse) {
        this.Cmorse = Cmorse;
    }

    public int[] getTamano() {
        return tamano;
    }

    public void setTamano(int[] tamano) {
        this.tamano = tamano;
    }

    public String getCpalabra() {
        return Cpalabra;
    }

    public void setCpalabra(String Cpalabra) {
        this.Cpalabra = Cpalabra;
    }
    
    
    public int cod(){
        
        int cont=0;
        
        try{
            
            
            for(int i = 0 ; i < Cmorse.length ; i++){ //AQUI SE RECORRE CADA LETRA PERO EN MORSE
                
                //Cmorse[k].equals(Cpalabra)
                System.out.println(i+" "+  Cpalabra.substring(0,Cmorse[i].length()) +"    =======   "+ Cmorse[i] );
                
                if(Cpalabra.length()<4){
                    
                    System.out.println(Cpalabra);
                    Cpalabra = Cpalabra + ",,,,,";
                    System.out.println(Cpalabra);
                    
                    if( Cpalabra.substring(0,Cmorse[i].length()).equals(Cmorse[i]) ){

                        cont= cont+1;
                        System.out.println("---------------");
                        System.out.println(cont);
                        System.out.println("---------------");
                    }
                }else{
                    if( Cpalabra.substring(0,Cmorse[i].length()).equals(Cmorse[i]) ){

                        cont= cont+1;
                        System.out.println("---------------");
                        System.out.println(cont);
                        System.out.println("---------------");
                    }
                }
                    
            }
            
            //System.out.println("Hay "+cont+ "resultados posibles");    
        
        }catch(Exception e){
                
            System.out.println(e.getMessage()); 
            System.out.println("error");
        }
        
        
        return cont;
    }
    
}
