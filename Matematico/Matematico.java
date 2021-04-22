    
 public class Matematico
    {
    /*metodos para el mayor, menor  y medio xd
       */
        public String mayor(int x, int y, int z){
        
       
       String may;
       
       x=x;
       y=y;
       z=z;
      
       if(x>y && x>z){
           may=x + " es mayor ";
        }else{
            if(y>x && y>z){
                may=y + " es mayor ";
            }else{
                if(z>x && z>y){
                  may=z + " es mayor "; 
                }else{
                    may= "";
                } 
            }
        }
      
        return may;
    }
    public String menor(int x, int y, int z){
        
       String men;
       x=x;
       y=y;
       z=z;
        if(x<y && x<z){
           men=x + " es menor ";
        }else{
            if(y<x && y<z){
               men=y + " es menor "; 
            }else{
                if(z<x && z<y){
                    men=z + " es menor ";
                }else{
                    men="";
                }
            }
        }
        return men;
    }
    public String medio(int x, int y, int z){
      
       String med;
       x=x;
       y=y;
       z=z;
       if((x>y && x<z)||(x>z && x<y)){
           med=x + " es medio ";
        }else{
            if((y>x && y<z)||(y<x && y>z)){
               med=y + " es medio "; 
            }else{
                if((z>x && z<y)||(z<x && z>y)){
                    med=z + " es medio ";
                }else{
                    med=" ";
                }
            }
        }
       return med;
    }
    /*puse double x q las areas pueden ser con decimales pah ;v
     * cm tambien no xd solo mame mio xddd
       */
     public double areaCuadrado(double b, double a){
         double area;
         area=b*a;
         return area;
        }
    /*metodo pa las coordenadas de dos puntos y calcular distancia
     * el x es x1, el y es x2, el z es y1 el n es y2 
     * si hablamos de las coordenadas xd
       */
        public double distPuntoPunto(double x, double y, double z, double n){
        double dist;
        dist=Math.sqrt(((y*y)- 2*y*x + (x*x))+((n*n)- 2*n*z + (z*z)));
        return dist;
        }
    /*metodo de las coordenadas de un punto y te dice en q cuadrante estan 
     * segun los puntos si son positivos o negativos ;v
     * me salio chevere pah ;v
       */
        public String cuadrantes(int x, int y){
        String cuadrante;
        x=x;
        y=y;
        if((x>0) && (y<0)){
            cuadrante= " esta en el 4to cuadrante ";
        }else{
            if((x>0) && (y>0)){
                cuadrante= " esta en el 1er cuadrante ";
            }else{
                if((x<0) && (y<0)){
                    cuadrante= " esta en el 3er cuadrante ";
                }else{
                    if((x<0) && (y>0)){
                       cuadrante= " esta en el 2do cuadrante ";
                    }else{
                        cuadrante= "";
                    }
                }
            }
        }
        return cuadrante;
    }    
      
    
}