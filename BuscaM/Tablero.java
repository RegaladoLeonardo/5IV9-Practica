import java.util.*;
import java.util.ArrayList;

class Tablero{
              
              Scanner entrada = new Scanner(System.in);
              private ArrayList<ArrayList<Casilla>> casillas = new ArrayList<ArrayList<Casilla>>();
              /* public String Tabla[][]={{"-","-","-","-","-","-"},
                                          {"-","-","-","-","-","-"},
                                          {"-","-","-","-","-","-"},
                                          {"-","-","-","-","-","-"},
                                          {"-","-","-","-","-","-"},
                                          {"-","-","-","-","-","-"}};
                                          */                         
              Casilla matriz[][] = new Casilla[6][6];
              private int continuar;
              private int cont;
              private int bombasRestantesA;
              /*
              private int x1,x2,x3,x4,x5,y1,y2,y3,y4,y5;

              public void setx(int x){
                            this.x=x; 
              }
              public int getx(){
                            return x;
              }
              */
              public Tablero(){
                            
                            for(int i=0; i<6; i++){
                                          this.casillas.add(new ArrayList<Casilla>());
                                          for (int j = 0; j<6; j++) {
                                                        Casilla ar= new Casilla(i, j);
                                                        this.casillas.get(i).add(ar);
                                          }
                            }
                            MostraraTab();
                            Cordenadas();
                            Minas();
                            Buscar();

              }
              public void Cordenadas(){
                            /* 
                            for(int j =0 ; j <6 ; j++){
                                          System.out.println(""); 
                                          for(int i = 0 ; i< 6 ; i++){
                                                        System.out.print(this.Tabla2[j][i]+" ");  
                                                        
                                          }
                            }
                            */
              }

              public void MostraraTab(){
                            System.out.print("------------------------------");
                            for(int i =0 ; i <6 ; i++){
                                          System.out.println(""); 
                                          for(int j = 0 ; j< 6 ; j++){ 
                                                        if(this.casillas.get(i).get(j).getTieneBomba()){
                                                                      System.out.print(" o ");
                                                        }
                                                        else{
                                                                      System.out.print(" X ");
                                                        }  
                                                        
                                          }
                            }
                            System.out.print("\n------------------------------\n");
                            /*
                            if((this.casillas.get(x).get(y))>0){
                                          System.out.print(this.casillas.get(x).get(y));
                            }else{
                                          System.out.print(" o ");
                            }
                            */
              }
              public void MostraraTabA(){
                            System.out.print("------------------------------");
                            for(int i =0 ; i <6 ; i++){
                                          System.out.println(""); 
                                          for(int j = 0 ; j< 6 ; j++){ 
                                                        if(this.casillas.get(i).get(j).getSeleccionado()){
                                                                      System.out.print(" "+this.casillas.get(i).get(j).getboomVecinas()+" ");
                                                        }
                                                        else{
                                                                      System.out.print(" X ");
                                                        }  
                                                        
                                          }
                            }
                            System.out.print("\n------------------------------\n");
                            /*
                            if((this.casillas.get(x).get(y))>0){
                                          System.out.print(this.casillas.get(x).get(y));
                            }else{
                                          System.out.print(" o ");
                            }
                            */
              }
              
              

              public void Minas(){

                            System.out.println(" ");
                            System.out.println("Jugador A: escriba las cordenadas donde quiera poner 5 minas!!");
                            int x=0, y=0;
                            for(int i=0; i<6; i++){
                                          int b=i+1 ;
                                          System.out.print("\n ");
                                          System.out.println("Mina----"+b);
                                          System.out.println("Escriba el numero de la Columna");
                                          y=entrada.nextInt();
                                          System.out.println("Escriba el numero de la ");
                                          x=entrada.nextInt();
                                          x=x-1;
                                          y=y-1;
                                          this.casillas.get(x).get(y).setTieneBomba(true);
                                          
                            }
              }

              public void Buscar(){
                            int x, y = 0;
                            MostraraTabA();
                            System.out.println("Jugador B: Escoja una cordenada para ver si hay mina!!");

                            for(int k=0; k<30; k++){  
                                          System.out.println("Escriba el numero de la columna");
                                          y=entrada.nextInt();
                                          System.out.println("Escriba el numero de la Fila");
                                          x=entrada.nextInt();
                                          x=x-1;
                                          y=y-1;
                                          if(this.casillas.get(x).get(y).getTieneBomba()){
                                                        System.out.println("Upps habia una bomba!!");
                                                        System.out.println("Nimodo perdiste!!!!");
                                                        k=30;
                                          }else{
                                                        this.casillas.get(x).get(y).Vecinos(x,y, this.casillas);
                                                        this.casillas.get(x).get(y).setSeleccionado(true);
                                                        System.out.println("El numero de minas alrededor son: " +this.casillas.get(x).get(y).getboomVecinas());
                                                        MostraraTabA();
                                          }
                                          if(k==29){
                                                        System.out.println("Ganaste!!! UWU");
                                                        System.out.println("Vuelva pronto!");
                                          }
                            }
              }
}
