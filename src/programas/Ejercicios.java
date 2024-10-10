package programas;

import java.util.Scanner;

public class Ejercicios {
    public static void programaSwitch(Scanner scanner){//al metodo se le agregar el parametro scanner
        System.out.println("  2. Programa de Switch-Valide su calificación");
        System.out.println();
        System.out.print("Ingresar rango de 1 -10: ");

        byte nota = scanner.nextByte(); //scanner.nextByte(); leer el valor de tipo byte

        switch (nota) {
            case 1:
            case 2:
                System.out.println("Su calificación es: F");
                break;
            case 3:
            case 4:
                System.out.println("Su calificación es: D");
                break;
            case 5:
            case 6:
                System.out.println("Su calificación es: C");
                break;
            case 7:
            case 8:
                System.out.println("Su calificación es: B");
                break;
            case 9:
            case 10:
                System.out.println("Su calificación es: A");
                break;
            default:
                System.out.println("Número no válido, por favor verifique");
        }
        System.out.println("--------------Enter para continuar--------------");
    }
    public static void programaTernaria(Scanner scanner){
        System.out.println("  2. Programa de Ternaria-Determine si un número es par o impar");
        System.out.println();
        System.out.print("Digite el número: ");

        int numero = scanner.nextInt();
        {                       //parametros
            String resultado = (numero % 2 == 0) ? "par" : "impar";//% Devuelve el resto de la division
            //del primer operador por el segundo
            System.out.println("El número " + numero + " es " + resultado + ".");
        }
        System.out.println("--------------Enter para continuar--------------");
    }
    public static void programaDoWhile(Scanner scanner){
        System.out.println("Adivine un número del 1 al 10");

        int numero = (int) (Math.random() * 10) + 1; // Math.random() genero un numero aleatorio 0.0 y 1.0
        int intento;

        do {
            System.out.print("Digite el número: ");
            intento = scanner.nextInt();

            if (intento < numero) {
                System.out.println("Demasiado bajo, intente nuevamente");
            } else if (intento > numero) {
                System.out.println("Demasiado alto, intente nuevamente");
            }
        } while (intento != numero);//los valores de dos operadores NO son iguales = true

        System.out.println("¡Felicidades! Has adivinado el número.");

        System.out.println("--------------Enter para continuar--------------");
    }
    public static void programaWhile(Scanner scanner){
        System.out.print("Introduce el valor de N: ");//Introduce N
        int N = scanner.nextInt();

        int suma = 0;// se inicializan las variables
        int contador = 1;// se inicializan las variables

        while (contador <= N) {
            suma += contador;// Añade contador a la suma y se le asigna a suma
            contador++;// Incrementa en 1 el valor contador
        }
        System.out.println("La suma de los números del 1 al " + N + " es: " + suma);

        System.out.println("--------------Enter para continuar--------------");
    }
    public static void programaFor(Scanner scanner){
        System.out.print("Introduce el valor de N: ");//Introduce N
        int N = scanner.nextInt();

        int suma = 0; // declaro la variable

        // declaro la variable e inicializar la variable del ciclo; la condicion; valor de i en cuanto va a incrementar
        for (int i = 1; i <= N; i++)
            suma += i; // Sumar i a suma

        System.out.println("La suma de los números del 1 al " + N + " es: " + suma);

        System.out.println("--------------Enter para continuar--------------");
    }
}
