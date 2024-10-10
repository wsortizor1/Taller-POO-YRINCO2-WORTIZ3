package ejecucion;

import explicaciones.Detalle;
import menus.MenuPrincipal;
import menus.SubMenus;
import programas.Ejercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //clase Scanner
        Scanner scannerEnter = new Scanner(System.in); //clase Scanner
        int menu, subMenu; //declaro tipo de dato y variable

        do {
            MenuPrincipal.menuPrincipal();//llamo la clase y el metodo
            menu = scanner.nextInt();// captura la opcion y la almacena en menu***********

            switch (menu) {
                case 1:
                    do {
                        System.out.println("*");
                        System.out.println("*");
                        System.out.println("------------------------------------------------");
                        System.out.println("-              Datos Primitivos                -");
                        System.out.println("------------------------------------------------");
                        System.out.println("-1. Explicación de Datos Primitivos            -");
                        System.out.println("-2. Ejemplo de Datos Primitivos                -");
                        System.out.println("-3. Otros ejemplos de datos primitivos         -");
                        System.out.println("-4. Volver                                     -");
                        System.out.println("*");
                        System.out.print("Seleccione una opción del submenu: ");
                        subMenu = scanner.nextInt();
                        switch (subMenu) {
                            case 1:
                                System.out.println("*");
                                System.out.println("*");
                                System.out.println("------------------------------------------------");
                                System.out.println("-    1. Explicación de Datos Primitivos        -");
                                System.out.println("------------------------------------------------");
                                System.out.println("Los datos primitivos son los tipos de datos    -");
                                System.out.println("más básicos y fundamentales en Java. Incluyen  -");
                                System.out.println("int, char, boolean, byte, short, long, float,  -");
                                System.out.println("y double.                                      -");
                                System.out.println("------------------------------------------------");
                                System.out.println("--------------Enter para continuar--------------");
                                scannerEnter.nextLine();
                                break;
                            case 2:
                                System.out.println("*");
                                System.out.println("*");
                                System.out.println("------------------------------------------------");
                                System.out.println("  2. Ejemplo de Datos Primitivos               -");
                                System.out.println("------------------------------------------------");
                                System.out.println("En este ejemplo, se declara una variable llamada");
                                System.out.println("numero de tipo int y se le asigna el valor 10.  ");
                                System.out.println("	Luego se imprime el valor de la variable 	");
                                System.out.println("			en la consola.  					");
                                System.out.println("------------------------------------------------");
                                System.out.println("public class EjemploDatosPrimitivos {          -");
                                System.out.println("    public static void main(String[] args) {   -");
                                System.out.println("        int numero = 10;                       -");
                                System.out.println("        System.out.println(\"El valor de la     -");
                                System.out.println("        variable numero es: \" + numero);       -");
                                System.out.println("    }                                          -");
                                System.out.println("}                                              -");
                                System.out.println("------------------------------------------------");
                                System.out.println("--------------Enter para continuar--------------");
                                scannerEnter.nextLine();
                                break;
                            case 3:
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
                                scannerEnter.nextLine();
                                break;
                            case 4:
                                System.out.println("-----------------Volver al menú-----------------");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                    } while (subMenu != 4);
                    break;
                case 2:
                    do {
                        System.out.println("*");
                        System.out.println("*");
                        System.out.println("------------------------------------------------");
                        System.out.println("-                  String                      -");
                        System.out.println("------------------------------------------------");
                        System.out.println("-1. Explicación de string                      -");
                        System.out.println("-2. Ejemplo y caracteristica del string        -");
                        System.out.println("-3. Volver                                     -");
                        System.out.println("*");
                        System.out.print("Seleccione una opción del submenu: ");
                        subMenu = scanner.nextInt();
                        switch (subMenu) {
                            case 1:
                                System.out.println("*");
                                System.out.println("*");
                                System.out.println("------------------------------------------------");
                                System.out.println("-    1. Explicacion de string                  -");
                                System.out.println("------------------------------------------------");
                                System.out.println(" un String es un tipo de dato que se utiliza   -");
                                System.out.println(" para representar texto.                       -");
                                System.out.println(" Básicamente, es una secuencia de caracteres   -");
                                System.out.println(" que se encuentran entre comillas dobles.      -");
                                System.out.println("    Por ejemplo, 'Hola mundo' es un String   -");
                                System.out.println("------------------------------------------------");
                                System.out.println("--------------Enter para continuar--------------");
                                scannerEnter.nextLine();
                                break;
                            case 2:
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
                                scannerEnter.nextLine();
                                break;
                            case 3:
                                System.out.println("Volver al menú");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                    } while (subMenu != 3);
                    break;

                case 3:
                    do {
                        System.out.println("*");
                        System.out.println("*");
                        System.out.println("------------------------------------------------");
                        System.out.println("-                  Constantes                  -");
                        System.out.println("------------------------------------------------");
                        System.out.println("-1. Explicación de constantes                  -");
                        System.out.println("-2. Ejemplo y caracteristica de constantes     -");
                        System.out.println("-3. Volver                                     -");
                        System.out.println("*");
                        System.out.print("Seleccione una opción del submenu: ");
                        subMenu = scanner.nextInt();

                        switch (subMenu) {
                            case 1:
                                System.out.println("*");
                                System.out.println("*");
                                System.out.println("------------------------------------------------");
                                System.out.println("-    1. Explicacion de constante               -");
                                System.out.println("------------------------------------------------");
                                System.out.println(" Es un valor que no cambia durante la ejecucion-");
                                System.out.println(" del programa. se utilizan para representar    -");
                                System.out.println(" valores fijos y de lectura unica              -");
                                System.out.println(" las constantes en JAVA se declaran usando     -");
                                System.out.println(" la palabra clave final                        -");
                                System.out.println("------------------------------------------------");
                                System.out.println("--------------Enter para continuar--------------");
                                scannerEnter.nextLine();
                                break;
                            case 2:
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
                                scannerEnter.nextLine();
                                break;
                            case 3:
                                System.out.println("Volver al menú");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }

                    } while (subMenu != 3);
                    break;

                case 4:
                    do {
                        System.out.println("*");
                        System.out.println("*");
                        System.out.println("------------------------------------------------");
                        System.out.println("-              Tipo de operadores              -");
                        System.out.println("------------------------------------------------");
                        System.out.println("-1. Operadores Aritméticos                     -");
                        System.out.println("-2. Operadores de Comparación                  -");
                        System.out.println("-3. Operadores de Asignación                   -");
                        System.out.println("-4. Operadores Lógicos                         -");
                        System.out.println("-5. Operadores Unarios                         -");
                        System.out.println("-6. Operadores de Condicional Ternario         -");
                        System.out.println("-7. Operadores de Tipo                         -");
                        System.out.println("-8. Operadores Bit a Bit                       -");
                        System.out.println("-9. Volver                                     -");
                        System.out.println("*");
                        System.out.print("Seleccione una opción del submenu: ");
                        subMenu = scanner.nextInt();

                        switch (subMenu) {
                            case 1:
                                System.out.println("*");
                                System.out.println("*");
                                System.out.println("------------------------------------------------");
                                System.out.println("-    1. Operadores Aritméticos                 -");
                                System.out.println("------------------------------------------------");
                                System.out.println(" Estos operadores se utilizan para realizar    -");
                                System.out.println(" operaciones matemáticas básicas               -");
                                System.out.println(" Suma (+): a + b                               -");
                                System.out.println(" Resta: a - b                                  -");
                                System.out.println(" Multiplicación (*): a * b                     -");
                                System.out.println(" División (/): a / b                           -");
                                System.out.println(" Módulo (%): a % b                             -");
                                System.out.println("------------------------------------------------");
                                System.out.println("--------------Enter para continuar--------------");
                                scannerEnter.nextLine();
                                break;

                            case 2:
                                System.out.println();
                                System.out.println();
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("  2.     Operadores de Comparación                                   -");
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println(" Estos operadores se utilizan para comparar dos valores.             -");
                                System.out.println(" Igual a (==): a == b                                                -");
                                System.out.println(" No igual a (!=): a != b         							  	     -");
                                System.out.println(" Mayor que (>): a > b									 		     -");
                                System.out.println(" Menor que (<): a < b												 -");
                                System.out.println(" Mayor o igual que (>=): a >= b										 -");
                                System.out.println(" Menor o igual que (<=): a <= b   							         -");
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("--------------Enter para continuar------------------------------------");
                                scannerEnter.nextLine();
                                break;

                            case 3:
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
                                scannerEnter.nextLine();
                                break;

                            case 4:
                                System.out.println();
                                System.out.println();
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("  4.            Operadores Lógicos                                   -");
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println(" Estos operadores se utilizan para combinar condiciones booleanas.   -");
                                System.out.println(" AND lógico (&&): a && b (true si ambas condiciones son verdaderas)  -");
                                System.out.println(" OR lógico (||): a || b (true si al menos una de las condiciones es verdadera)   -");
                                System.out.println(" NOT lógico (!): !a (invierte el valor booleano de a)                -");
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("--------------Enter para continuar------------------------------------");
                                scannerEnter.nextLine();
                                break;

                            case 5:
                                System.out.println();
                                System.out.println();
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("  5. 		   Operadores Unarios                                    -");
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println(" Estos operadores operan sobre un solo operando.					 -");
                                System.out.println(" Negación (-): -a (invierte el signo del valor)                      -");
                                System.out.println(" Incremento (++): a++ o ++a (aumenta el valor en 1)	 			     -");
                                System.out.println(" Decremento (--): a-- o --a (disminuye el valor en 1)		         -");
                                System.out.println(" Complemento a uno (~): ~a (invierte todos los bits del valor)		 -");
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("--------------Enter para continuar------------------------------------");
                                scannerEnter.nextLine();
                                break;

                            case 6:
                                System.out.println();
                                System.out.println();
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("  6. 		  Operadores de Condicional Ternario                     -");
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println(" Se utilizan para realizar una asignación basada en una condición.   -");
                                System.out.println(" 												                     -");
                                System.out.println(" Ternario (?:): condition ? trueValue : falseValue 	 			     -");
                                System.out.println(" (si condition es verdadera, devuelve trueValue; de lo contrario,    -");
                                System.out.println(" devuelve falseValue)	      										 -");
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("--------------Enter para continuar------------------------------------");
                                scannerEnter.nextLine();
                                break;

                            case 7:
                                System.out.println();
                                System.out.println();
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("  7. 		 Operadores de Tipo						                 -");
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println(" Estos operadores se utilizan para trabajar con tipos de datos.	  	 -");
                                System.out.println(" 												                     -");
                                System.out.println(" Instanceof (instanceof): a instanceof Type (verifica si 			 -");
                                System.out.println(" a es una instancia del tipo Type)								     -");
                                System.out.println("   				    	      										 -");
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("--------------Enter para continuar------------------------------------");
                                scannerEnter.nextLine();
                                break;

                            case 8:
                                System.out.println();
                                System.out.println();
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("  8. 		 Operadores Bit a Bit					                 -");
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println(" Estos operadores trabajan con los bits individuales de los valores. -");
                                System.out.println(" AND bit a bit (&): a & b 						                     -");
                                System.out.println(" OR bit a bit (|): a | b								 			 -");
                                System.out.println(" XOR bit a bit (^): a ^ b										     -");
                                System.out.println(" Desplazamiento a la izquierda (<<): a << b (desplaza los bits       -");
                                System.out.println(" de a hacia la izquierda b posiciones) 							     -");
                                System.out.println(" Desplazamiento a la derecha sin signo (>>>): a >>> b (desplaza los  -");
                                System.out.println(" bits de a hacia la derecha b posiciones sin signo) 			     -");
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("--------------Enter para continuar------------------------------------");
                                scannerEnter.nextLine();
                                break;

                            case 9:
                                System.out.println("Volver al menú");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                    } while (subMenu != 9);
                    break;

                case 5:
                    do {
                        System.out.println("*");
                        System.out.println("*");
                        System.out.println("------------------------------------------------");
                        System.out.println("-       Condicional IF, ELSE, IF ELSE          -");
                        System.out.println("------------------------------------------------");
                        System.out.println("-1. Estructura if					           -");
                        System.out.println("-2. Estructura if-else                         -");
                        System.out.println("-3. Estructura if-else if-else                 -");
                        System.out.println("-4. Volver                                     -");
                        System.out.println("*");
                        System.out.print("Seleccione una opción del submenu: ");
                        subMenu = scanner.nextInt();
                        switch (subMenu) {
                            case 1:
                                System.out.println("*");
                                System.out.println("*");
                                System.out.println("------------------------------------------------");
                                System.out.println("-    1. Estructura if                          -");
                                System.out.println("------------------------------------------------");
                                System.out.println(" La estructura if se usa para ejecutar un      -");
                                System.out.println(" bloque de código si una condición es verdadera-");
                                System.out.println("												");
                                System.out.println(" int number = 10;                              -");
                                System.out.println(" if (number > 0) {                             -");
                                System.out.println("  System.out.println(El número es positivo);   -");
                                System.out.println("------------------------------------------------");
                                System.out.println("--------------Enter para continuar--------------");
                                scannerEnter.nextLine();
                                break;
                            case 2:
                                System.out.println();
                                System.out.println();
                                System.out.println("------------------------------------------------");
                                System.out.println("  2. Estructura if-else						   -");
                                System.out.println("------------------------------------------------");
                                System.out.println(" La estructura if-else permite ejecutar un     -");
                                System.out.println(" bloque de código si la condición es verdadera -");
                                System.out.println("	y otro bloque si la condición es falsa.    -");
                                System.out.println("												");
                                System.out.println("------------------------------------------------");
                                System.out.println(" if (condition) {						       -");
                                System.out.println(" // Bloque de código a ejecutar si la          -");
                                System.out.println(" condición es verdadera 						");
                                System.out.println("        } else {		                       -");
                                System.out.println("  // Bloque de código a ejecutar si la         -");
                                System.out.println(" condición es falsa								");
                                System.out.println("    }                                          -");
                                System.out.println("}                                              -");
                                System.out.println("------------------------------------------------");
                                System.out.println("--------------Enter para continuar--------------");
                                scannerEnter.nextLine();
                                break;
                            case 3:
                                System.out.println("*");
                                System.out.println("*");
                                System.out.println("------------------------------------------------------------");
                                System.out.println("           3.     Estructura if-else if-else	    	   -");
                                System.out.println("------------------------------------------------------------");
                                System.out.println(" La estructura if-else if-else permite manejar             -");
                                System.out.println(" múltiples condiciones.							           -");
                                System.out.println(" Puedes usar varias cláusulas else if para verificar       -");
                                System.out.println(" múltiples condiciones y un bloque else al final para      -");
                                System.out.println(" manejar el caso en que ninguna de condiciones anteriores  -");
                                System.out.println(" sea verda                                                 -");
                                System.out.println("                                                           -");
                                System.out.println("------------------------------------------------------------");
                                System.out.println("   if (condition1) {   						   			   -");
                                System.out.println(" // Bloque de código a ejecutar si condition1 es verdadera -");
                                System.out.println(" } else if (condition2) {  							       -");
                                System.out.println(" // Bloque de código a ejecutar si condition1 es falsa     -");
                                System.out.println("       y condition2 es verdadera  				    	   -");
                                System.out.println(" } else {                                                  -");
                                System.out.println(" // Bloque de código a ejecutar si ninguna de las          -");
                                System.out.println(" condiciones anteriores es verdadera                       -");
                                System.out.println("  }                                                        -");
                                System.out.println("------------------------------------------------------------");
                                System.out.println("---------------------Enter para continuar-------------------");
                                scannerEnter.nextLine();
                                break;
                            case 4:
                                System.out.println("Volver al menú");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                    } while (subMenu != 4);
                    break;

                case 6:
                    do {
                        SubMenus.opcionesSwitch();//llamo la clase y el metodo
                        subMenu = scanner.nextInt();
                        switch (subMenu) {
                            case 1:
                                Detalle.explicacionSwitch();//llamo la clase y el metodo
                                scannerEnter.nextLine();
                                break;
                            case 2:
                                Ejercicios.programaSwitch(scanner);// llamo la clase y el metodo junto al scanner
                                scannerEnter.nextLine();
                                break;
                            case 3:
                                System.out.println("Volver al menú");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                    }
                    while (subMenu != 3);//los valores de dos operadores NO son iguales = true
                    break;
                case 7:
                    do {
                        SubMenus.opcionesTernarias();
                        subMenu = scanner.nextInt();
                        switch (subMenu) {
                            case 1:
                                Detalle.explicacionTernaria();//llamo la clase y el metodo
                                scannerEnter.nextLine();
                                break;
                            case 2:
                            Ejercicios.programaTernaria(scanner);// llamo la clase y el metodo junto al scanner
                            scannerEnter.nextLine();
                            break;
                            case 3:
                                System.out.println("Volver al menú");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                    }
                    while (subMenu != 3);//los valores de dos operadores NO son iguales = true
                    break;
                case 8:
                    do {
                        SubMenus.opcionesDoWhile();
                        subMenu = scanner.nextInt();
                        switch (subMenu) {
                            case 1:
                                Detalle.explicacionDoWhile();
                                scannerEnter.nextLine();
                                break;
                            case 2:
                                Ejercicios.programaDoWhile(scanner);
                                scannerEnter.nextLine();
                                break;
                            case 3:
                                System.out.println("Volver al menú");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                    }
                    while (subMenu != 3);
                    break;
                case 9:
                    do {
                        SubMenus.opcionesWhile();
                        subMenu = scanner.nextInt();
                        switch (subMenu) {
                            case 1:
                                Detalle.explicacionWhile();
                                scannerEnter.nextLine();
                                break;
                            case 2:
                                Ejercicios.programaWhile(scanner);
                                scannerEnter.nextLine();
                                break;
                            case 3:
                                System.out.println("Volver al menú");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                    }
                    while (subMenu != 3);
                    break;
                case 10:
                    do {
                        SubMenus.opcionFor();
                        subMenu = scanner.nextInt();
                        switch (subMenu) {
                            case 1:
                                Detalle.explicacionFor();
                                scannerEnter.nextLine();
                                break;
                            case 2:
                                Ejercicios.programaFor(scanner);
                                scannerEnter.nextLine();
                                break;
                            case 3:
                                System.out.println("Volver al menú");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                    }
                    while (subMenu != 3);
                    break;
                case 11:
                    System.out.println("Chao");
                    break;
                default:
                    System.out.println("Opcion no valida, intentalo de nuevo");
            }
        } while (menu != 11);
        scanner.close();
        scannerEnter.close();
    }
}