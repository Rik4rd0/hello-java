package JavaStart.Ejercicios;

import java.util.Scanner;

public class leerEntradas {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Introduce tu nombre:");
        String nombre= scanner.next();

        System.out.println("Introduce tu edad:");
        int edad= scanner.nextInt();

        System.out.println("mi nombre es " + nombre + " y tengo " + edad + " años");
    }
}
