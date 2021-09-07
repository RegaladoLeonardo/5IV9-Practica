import java.util.*;
class Jugar{

              public static void main(String[] args){
                            Scanner entrada = new Scanner(System.in);
                            String continuar ;

                            System.out.println("Ese es el tablero donde jugara!!!");
                            //do{
                            try{ 
                                          Tablero mesa=new Tablero();
                                          mesa.Cordenadas();
                                          //System.out.println("\nQuiere jugar de nuevo?");
                                          //continuar=entrada.nextLine();
                            }catch(Exception e) {
                                          System.out.println("Mete un numero valido porfavor :3");
                            }
                            //}while(continuar.equalsIgnoreCase("Si"));
              }
}


