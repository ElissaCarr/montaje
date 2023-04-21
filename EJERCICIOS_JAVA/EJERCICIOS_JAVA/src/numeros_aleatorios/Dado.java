
package numeros_aleatorios;


public class Dado {

    
    public static void main(String[] args) {
        System.out.println(Math.random());
    //[1,6]
    int x = (int) (Math.random()*6 + 1);
    //[4,8]
    int y = (int) (Math.random()*5 + 4 );
    //[0,1]
    int z = (int) (Math.random()*2);
    
    //CAST
    double w = 1.72343;
    int t = (int)w;
    System.out.println(w);
    System.out.println(t);
    
    //CAST CON LETRAS
    char letra = 'A';
    int nletra = (int)letra;
    System.out.println(letra);
    System.out.println(nletra);
    
    
    
    System.out.println(Math.random());
    //[1,6]
    int a = (int) (Math.random()*6 + 1);
    //[4,8]
    int b = (int) (Math.random()*5 + 4 );
    //[0,1]
    int c = (int) (Math.random()*2);
   System.out.println("A: " + a);
   System.out.println("B: " + b);
   System.out.println("C: "+ c);
    }
    
}
