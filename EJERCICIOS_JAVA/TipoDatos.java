
package tiposdatos;

public class TipoDatos {

    public static void main(String[] args) {
       //Declaración de números enteros 
           //Valor mínimo y máximo de un tipo byte (-128 al 127)
           System.out.println("Máximo del byte: " + Byte.MAX_VALUE);
           System.out.println("Mínimo del byte: " + Byte.MIN_VALUE + "\n" );
           byte y = 2; //Declaración de la variable
           
           //Valor mínimo y máximo de un tipo Short (-32768 al 32767)
           System.out.println("Máximo del short: " + Short.MAX_VALUE);
           System.out.println("Mínimo del short: " + Short.MIN_VALUE + "\n");
           short z = 23424; //Declaración de la variable
           
           //Valor mínimo y máximo de un tipo integer (-2147483648 al 2147483647)
           System.out.println("Máximo del integer: " + Integer.MAX_VALUE);
           System.out.println("Mínimo del integer: " + Integer.MIN_VALUE + "\n");
           int x = 5; //Números enteros, ocupa 4 byte, Declaración de la variable
           
           //Valor mínimo y máximo de un tipo long (-9223372036854775808 al 9223372036854775807)
           System.out.println("Máximo del long: " + Long.MAX_VALUE);
           System.out.println("Mínimo del long: " + Long.MIN_VALUE + "\n");
           long w = 94983044;//Declaración de la variable
           
       //Declaración de números reales
           //Valor mínimo y máximo de un tipo float (1.4E-45 al 3.4028235E38)
           System.out.println("Máximo del float: " + Float.MAX_VALUE);
           System.out.println("Mínimo del float: " + Float.MIN_VALUE + "\n");
           float j = 2.165f; //Declaración de la variable
           
           //Valor mínimo y máximo de un tipo double (4.9E-324 al 1.7976931348623157E308)
           System.out.println("Máximo del double: " + Double.MAX_VALUE);
           System.out.println("Mínimo del double: " + Double.MIN_VALUE + "\n");
           double a = 6.316; //Declaración de la variable
       
       //Declaración de caracteres
       char p = 'a' ; //solo un caracter, hay que ponerlo entre comillas simples.Declaración de la variable
       
       //Declaración de cadenas
       String h = "hola que tal"; //Es una cadena de caracteres, Declaración de la variable
       int longitud = h.length(); //longitud del string, Declaración de la variable
       char pLetra = h.charAt(0); //En este caso para ver la primera letra
       char lLetra = h.charAt(11); //En este caso para ver la última letra
       System.out.println(h + " " + longitud + " " + pLetra + " " + lLetra + "\n");
       
       String s1 = "hola";
       String s2 = "Hola";
       boolean c1 = s1.equals(s2); //este metodo me da false por la mayuscula
       boolean c2 = s1.equalsIgnoreCase(s2);//este metodo me da true porque no le importa la mayuscula
       System.out.println("Manera estricta: " + c1);
       System.out.println("Manera no estricta: " + c2 + "\n");
        
        //convertir un entero en cadena
        int x2 = 123;
        String s3 = String.valueOf(x2);
        System.out.println("Cadena: " + s3 + "\n");
        
       
       //Declaración de lógicos 
        boolean m = true; //True o false, Declaración de la variable
    }
    
}
