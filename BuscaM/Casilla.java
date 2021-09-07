import java.util.*;

class Casilla{
              Scanner entrada = new Scanner(System.in);
              private int boomVecinas=0;
              private boolean tieneBomba=false;
              private boolean seleccionado=false ;
              private int x, y;

              public Casilla(int x , int y){
                            this.x = x;
                            this.y = y;

              }
              public int getx(int x){
                            return x;
              }

              public int gety(int y){
                            return y;
              }

              public void setTieneBomba(boolean tieneBomba){
                            this.tieneBomba=tieneBomba;
              }
              public void setSeleccionado(boolean seleccionmado){
                            this.seleccionado=seleccionmado;
              }
              public void setboomVecinas(int boomVecinas){
                            this.boomVecinas=boomVecinas;
              }
              public Boolean getTieneBomba(){
                            return this.tieneBomba;
              }

              public Boolean getSeleccionado(){
                            return this.seleccionado;
              }
              public int getboomVecinas(){
                            return this.boomVecinas;
              }

              public void Vecinos(int x, int y, ArrayList<ArrayList<Casilla>> casillas){
                            for( int i=x-1; i<=x+1; i++ ){
                                          for(int j=y-1; j<=y+1; j++){
                                                        if((this.x!=i || this.y!=j) && ((i>=0 && j>=0) && (i<=5 && j<=5)) && casillas.get(i).get(j).getTieneBomba()){
                                                                      this.boomVecinas = this.boomVecinas + 1;
                                                        }else{
                                                                      
                                                        }
                                          }

                            }
              }

}