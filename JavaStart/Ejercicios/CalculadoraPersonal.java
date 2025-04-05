package JavaStart.Ejercicios;

import java.util.Scanner;

public class CalculadoraPersonal {


    public static void main(String[] args) {
    /*
    * Desarrolla un programa en Java que funcione como una calculadora personal de datos físicos. El programa debe:

Declarar variables de todos los tipos primitivos para almacenar información relevante Calcular el área y perímetro de un rectángulo (que podría representar una piscina o una habitación)
Convertir temperaturas entre Celsius y Fahrenheit Calcular el IMC (Índice de Masa Corporal) de una persona

Instrucciones:

Crea una clase llamada CalculadoraPersonal
*
En el método main, utiliza Scanner para solicitar al usuario:

Nombre (String, no es tipo primitivo pero necesario para personalización)
Edad (int)
Altura en metros (double)
Peso en kilogramos (double)
Temperatura actual en Celsius (float)
Si está activo físicamente o no (boolean)
Largo y ancho de su habitación en metros (double)


Con estos datos, tu programa debe:

Mostrar todos los datos ingresados utilizando diferentes tipos primitivos
Calcular y mostrar el área y perímetro de la habitación
Convertir y mostrar la temperatura en Fahrenheit
Calcular y mostrar el IMC, indicando en qué categoría se encuentra:

Menos de 18.5: Bajo peso
Entre 18.5 y 24.9: Peso normal
Entre 25.0 y 29.9: Sobrepeso
30.0 o más: Obesidad*/

        //tu código aquí

        Scanner scanner= new Scanner(System.in);

        System.out.println("Introduce tu nombre:");
        String nombre= scanner.next();

        System.out.println("Edad");
        int edad= scanner.nextInt();

        System.out.println("Altura en metros");
        double altura= scanner.nextDouble();

        System.out.println("Peso en kilogramos");
        double peso= scanner.nextDouble();

        System.out.println("Temperatura actual en Celsius");
        float temperaturaC= scanner.nextFloat();

        System.out.println("¿Estás activo físicamente? (true/false)");
        boolean activo= scanner.nextBoolean();

        System.out.println("Largo de la habitación en metros");
        double largo= scanner.nextDouble();

        System.out.println("Ancho de la habitación en metros");
        double ancho= scanner.nextDouble();


        byte nivelActividad = 0; // Ejemplo: podría ser un nivel del 1 al 5
        short diasActivo = 0;    // Ejemplo: días activo en el año
        long idUsuario = 10000L + edad; // Ejemplo: crear un ID único
        char categoriaUsuario = 'A'; // Ejemplo: categoría según edad


        // Mostrar todos los datos ingresados
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + " kilogramos");
        System.out.println("Temperatura en Celsius: " + temperaturaC + "°C");
        System.out.println("¿Activo físicamente?: " + activo);
        System.out.println("Largo de la habitación: " + largo + " metros");
        System.out.println("Ancho de la habitación: " + ancho + " metros");

        //mostrar los perimetros

        double area = largo * ancho;

        double perimetro = 2 * (largo + ancho);

        System.out.println("Área de la habitación: " + area + " metros cuadrados");


        //convertir temperatura a Fahrenheit
        float temperaturaF= (temperaturaC * 9/5) + 32;

        System.out.println("Temperatura en Fahrenheit: " + temperaturaF + "°F");

        //carcular IMC

        double imc = peso / (altura * altura);

        System.out.println("IMC: " + imc);

    }
}
