
package estructura_bucle_for;

import java.util.Scanner;


public class Recorrer_cadena {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //DEFINIR DATOS
        String texto;
        //ENTRADA
        System.out.println ("Ingrese un texto?");
        texto = sc.nextLine();
        //PROCESO
        for(int i=0; i<texto.length();i++){
                System.out.println(texto.charAt(i)); 
      }      
    }
    
}
