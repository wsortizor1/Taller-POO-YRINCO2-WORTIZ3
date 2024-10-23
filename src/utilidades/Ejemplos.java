package utilidades;

public class Ejemplos {
    public static void ejemplosDatosPrimitivos () {
        System.out.println("*");
        System.out.println("*");
        System.out.println("------------------------------------------------");
        System.out.println(" 3.    Otros ejemplos de datos primitivos       ");
        System.out.println("------------------------------------------------");
        System.out.println("char: para caracteres individuales como 'a' 'Z'-");
        System.out.println("boolean: para valores booleanos (true o false).-");
        System.out.println("double: números punto flotante  doble precisión-");
        System.out.println("float: números punto flotante  precisión simple-");
        System.out.println("long: para números enteros largos.			   -");
        System.out.println("short: para números enteros cortos.		       -");
        System.out.println("byte: para números enteros muy pequeños.  	   -");
        System.out.println("                                               -");
        System.out.println("------------------------------------------------");
        System.out.println("--------------Enter para continuar--------------");
    }

    public static void ejemploString() {
        System.out.println("*");
        System.out.println("*");
        System.out.println("------------------------------------------------");
        System.out.println("     2.     Ejemplo de String                  -");
        System.out.println("------------------------------------------------");
        System.out.println(" Inmutabilidad: Una vez que se crea un String,  ");
        System.out.println(" su valor no puede ser modificado.              ");
        System.out.println(" Cualquier operación que parezca modificar un 	");
        System.out.println(" String en realidad crea un nuevo objeto String	");
        System.out.println(" Declaración: Para declarar un String,          ");
        System.out.println(" simplemente utilizas la palabra clave	String  ");
        System.out.println(" seguida del nombre de la variable y el valor   ");
        System.out.println(" y el valor entre comillas dobles.              ");
        System.out.println("------------------------------------------------");
        System.out.println("                                               -");
        System.out.println("      String saludo = 'Hola, mundo';           -");
        System.out.println("                                               -");
        System.out.println("------------------------------------------------");
        System.out.println("--------------Enter para continuar--------------");
    }

    public static void ejemploComparacion(){
        System.out.println();
        System.out.println();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("  3.     Operadores de Asignación                                    -");
        System.out.println("----------------------------------------------------------------------");
        System.out.println(" Estos operadores se utilizan para asignar valores a las variables.  -");
        System.out.println(" Asignación (=): a = b                                               -");
        System.out.println(" Asignación con suma (+=): a += b (equivalente a a = a + b)  	     -");
        System.out.println(" Asignación con resta (-=): a -= b (equivalente a a = a - b)         -");
        System.out.println("Asignación con multiplicación (*=): a *= b (equivalente a a = a * b) -");
        System.out.println(" eAsignación con división (/=): a /= b (equivalente a a = a / b)     -");
        System.out.println("Asignación con módulo (%=): a %= b (equivalente a a = a % b)         -");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("--------------Enter para continuar------------------------------------");
    }

    public static void ejemploConstantes(){
        System.out.println("*");
        System.out.println("*");
        System.out.println("------------------------------------------------");
        System.out.println("       2. Ejemplo de constante                 -");
        System.out.println("------------------------------------------------");
        System.out.println(" Constantes literales                           ");
        System.out.println(" Por ejemplo, el numero '25' en                 ");
        System.out.println(" 'int edad =25; ' es una constante literarl   	");
        System.out.println("                                               	");
        System.out.println(" Constantes definidas con 'final'               ");
        System.out.println(" ejemplo como 'final int MAX_VALUE =100;'       ");
        System.out.println(" que define que una constante no puede ser      ");
        System.out.println(" modificada                                     ");
        System.out.println("------------------------------------------------");
        System.out.println(" Ejemplo de uso: constante 'PI' para calculos  -");
        System.out.println(" final double PI = 3.14159;                    -");
        System.out.println(" double area = PI * radio * radio;             -");
        System.out.println("------------------------------------------------");
        System.out.println("--------------Enter para continuar--------------");
    }
}
