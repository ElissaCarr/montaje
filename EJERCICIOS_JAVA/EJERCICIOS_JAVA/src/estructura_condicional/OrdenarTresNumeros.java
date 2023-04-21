package estructura_condicional;

import java.util.Scanner;

public class OrdenarTresNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //DEFINIR DATOS
        int a, b, c;
        double pro;
        //ENTRADA
        System.out.print("Ingrese nota 1? ");
        a = sc.nextInt();
        System.out.print("Ingrese nota 2? ");
        b = sc.nextInt();
        System.out.print("Ingrese nota 3? ");
        c = sc.nextInt();
        //PROCESO
        pro = (a + b + c) / 3.0;
        System.out.println("Promedio: " + Math.round(pro*100.0)/100.0);
        if (a == b && b == c) {
            System.out.println(a + " " + b + " " + c);

        } else {
            if (a > b && b > c) {
                System.out.println(a + " " + b + " " + c);
            }
            if (a >= c && c >= b) {
                System.out.println(a + " " + c + " " + b);
            }
            if (b >= a && a >= c) {
                System.out.println(b + " " + a + " " + c);
            }
            if (b > c && c > a) {
                System.out.println(b + " " + c + " " + a);
            }
            if (c > a && a > b) {
                System.out.println(c + " " + a + " " + b);
            }
            if (c >= b && b >= a) {
                System.out.println(c + " " + b + " " + a);
            }
        }
    }
}
