/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author levar
 */
public class Funciones {
    
    
    private File archivo = new File("registro.txt");
    private File base = new File("datos.txt");
    private static ObjectInputStream entrada;
    private static ObjectOutputStream salida;
    ArrayList<Palabra> pal = new ArrayList();
    ArrayList<Teclas>  fra = new ArrayList();
   
    
    public void Guardar() throws FileNotFoundException, IOException{
        
        ObjectOutputStream salida;
        FileOutputStream fo = new FileOutputStream(archivo);
        
        salida = new ObjectOutputStream(fo);
        salida.writeObject(pal);
        
        salida.close();
        
    }
    
    
    public void Guardart() throws FileNotFoundException, IOException{
        
        ObjectOutputStream salida;
        FileOutputStream fi = new FileOutputStream(base);
        
        salida = new ObjectOutputStream(fi);
        salida.writeObject(fra);
        
        salida.close();
        System.out.println( "lo que se guarda es: "+ fra);
        
        
    }
    
    
    
    public void Leert() throws FileNotFoundException, IOException, ClassNotFoundException{
        
        FileInputStream fo = new FileInputStream(base);
        
        ObjectInputStream entrada = new ObjectInputStream(fo);
        
        fra = (ArrayList)entrada.readObject();
        
        for(Teclas a:fra){
            
            
            JOptionPane.showMessageDialog(null, "Mensaje original:   "+ a.getCodigo() +"\n"
                    + "Mensaje descodificado :   "+ a.getResultado() );
            
        }
    }
    
    
    
    public void Leer() throws FileNotFoundException, IOException, ClassNotFoundException{
        
        FileInputStream fi = new FileInputStream(archivo);
        
        ObjectInputStream entrada = new ObjectInputStream(fi);
        
        pal= (ArrayList)entrada.readObject();
        
        
        for(Palabra a:pal){
            
            JOptionPane.showMessageDialog(null, "Mensaje original:   "+ a.getText() +"\n"
                    + "Mensaje final:   "+ a.getResultado() );
            
        }
    }
    
    public void agregarPalabra( String palabra, String resultado) throws IOException{
        
        
        Palabra obj = new Palabra(palabra, resultado);
        
        pal.add(obj);
        
        
        Guardar(); 
        
        JOptionPane.showMessageDialog(null, "¡¡Se ha guardado con exito!!");
        
    }
    
    public void agregarMensaje( String frase, String resultado) throws IOException{
        
        
        Teclas ob = new Teclas();
        
        
        ob.setResultado(resultado);
        ob.setCodigo(frase);
        
        fra.add(ob);
        
        Guardart(); 
        
        JOptionPane.showMessageDialog(null, "¡¡Se ha resgistrado con exito!!");
        
    }
    
    
}
