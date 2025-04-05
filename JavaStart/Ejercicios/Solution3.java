package JavaStart.Ejercicios;

import java.util.Scanner;

public class Solution3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.println("el nombre es ");
            String nombre = scanner.next();

            // Leer nombre y edad
            System.out.println("Introduce num:");
            int num=scanner.nextInt();



            System.out.printf("===========================\n");

            for(int i=0; num<3; i++){

                System.out.printf("%-10s %03d\n", nombre, num);
            }
            System.out.printf("===========================\n");

            scanner.close();
        }
    }

