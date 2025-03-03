
package alturas;

import java.util.Scanner;

public class Alturas {
    int tamaño_arreglo;
    double altura_baja;
    double altura_alta;
    double[]Alturas;

    public Alturas() {
    this.altura_baja = Double.MAX_VALUE;
    this.altura_alta = Double.MIN_VALUE;   
    }    
    public void Ingresar_Datos (){
        Scanner Leer=new Scanner (System.in);
        System.out.println("Ingrese cuantas alturas va a ingresar:");  
        tamaño_arreglo=Leer.nextInt();
        Alturas=new double[tamaño_arreglo];
        for (int i = 0; i <Alturas.length; i++) {
            System.out.println("Ingrese la altura "+(i+1));  
            Alturas[i]=Leer.nextDouble();
            if (Alturas[i]<altura_baja) {
               altura_baja=Alturas[i];        
            } else {
                if (Alturas[i]>altura_alta) {
                    altura_alta=Alturas[i];
                    
                }
            }           
        }
        System.out.println("La altura más baja es: "+altura_baja);
        System.out.println("La altura más alta es: "+altura_alta);
    }
    public static void main(String[] args) {
    Alturas estudiantes=new Alturas ();
    estudiantes.Ingresar_Datos();
    }
    
}
