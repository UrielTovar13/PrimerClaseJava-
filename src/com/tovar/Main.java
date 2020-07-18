package com.tovar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Mi nombre es: Uriel Tovar");
        System.out.println(24);
        System.out.println(2);

        //Tipos de comentario

        // Una sola linea.
        /**
         * Multiples
         * Lineas
         * */

        //"" - Comillas dobles
        //'' - Comillas simples

        /**Tipos de datos*/

        //Como declarar un tipo de dato String
        String language = "Java es el lenguaje mas utilizado";

        // Camel case
        String lastName;

        //Como declarar un tipo de dato char
        char character = 'H';

        //Como declarar un tipo de dato Byte
        byte bye = 1;

        //Como declarar un tipo de dato Short
        short favoriteNumber = 7;

        //Como declarar un tipo de dato Entero
        int age = 24; // 2,000,098

        //Como declarar un tipo de dato Byte
        long creditCart = 5000000;

        //Como declarar un tipo de dato Double
        double money = 100.99;

        //Como declarar un tipo de dato Float
        float myMoney = 5000000.99F;

        //Manera de hacer una sumatoria de tipo de dato int con double
        double suma = age + money;

        System.out.println(suma);

        String creditCartNumber = "2345-2345-2345-5434";
        String[] array = creditCartNumber.split("-");

        //Manera de convertir un tipo de dato String a un int
        int firstNumber = Integer.parseInt(array[1]);

        System.out.println(firstNumber);

        //Como declarar un tipo de dato boolean
        boolean isTrue = true;

        System.out.println(isTrue);

        /**
         * Ejercicio: Declarar una variable donde guarden su nombre, una variable donde
         * guarden su edad, variable donde guarden si tomaron café, variable donde guarden la hora, variable donde
         * guarden el siguiente número: 1999.9999 e implimirlo en una sola linea en la consola.
         * */

        //Cocatenación
        String hobbyUno = "Ir al cine";
        String hobbyDos = "ir al parque";
        String hobbyTres = "platicar con mis amigos";

        System.out.println("La condición es:" + isTrue);

        System.out.println(hobbyUno + ", " + hobbyDos + " y " + hobbyTres);

        /** Operadores aritméticos.*/
        // +, -, *, /, %
        int primerNumero, segundoNumero, resultado;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        primerNumero = read.nextInt();
        read.nextLine();
        System.out.println("Ingrese el segundo número");
        segundoNumero = read.nextInt();
        read.nextLine();
        resultado = primerNumero - segundoNumero;
        System.out.println("El resultado de la suma es: " + resultado);

        /** Suma: +*/
        // Resta: -
        // Multiplicación: *
        // División: /
        // Residuo: %


        /**
         * Ejercico: Escribir un programa que pida al usuario tres números, ya que los obtenga entonces los dos primeros
         * los reste y despues el resultado de la resta lo multiplique por el tercer numero proporcionado.
         * */

        /**Switch*/

        System.out.println("*********************************************");
        String option;
        System.out.println("Ingrese la opción a ajecutar: A) o B)");
        option = read.nextLine();

        switch(option) {
            case "A":
                System.out.println("Seleccionaste opción A");
                break;
            case "B":
                System.out.println("Seleccionaste opción B");
                break;
            default:
                System.out.println("La opción seleccionada no esta dentro del sistema");
                break;
        }

        double lat = -7.000;
        double longitude = -17.777;

        String location = "-17´00´´";

        /**
         * Tarea 1: Escribir en pseudocódigo o dibujar en diagrama de flujo, lo siguiente:
         *
         * El sistema debe de pedir la opción al usuario que desea ejecutar: 1) Suma 2) Resta 3) Multiplicación 4) División
         *
         * Con base en la opción que el usuario ingreso, se ejecutara lo siguiente:
         *
         * 1: La suma de tres numeros proporcionados por el usuario.
         * 2: La resta de dos numeros proporcionados por el usuario.
         * 3: La multiplicación de tres numeros proporcionados por el usuario.
         * 4: La división de dos numeros proporcionados por el usuario.
         *
         * Nota: Cuando el usuario no ingrese alguna opción valida mandar un mensaje en la consola de "Operación invalida"
         *
         *
         * Tarea 2: Pasar el diagrama o pseudocódigo a sintaxis de Java.
         *
         * */

    }
}
