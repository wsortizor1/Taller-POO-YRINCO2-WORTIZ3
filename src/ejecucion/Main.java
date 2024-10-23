package ejecucion;

import explicaciones.Detalle;
import menus.MenuPrincipal;
import menus.SubMenus;
import programas.Ejercicios;
import utilidades.Ejemplos;

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
                        SubMenus.opcionesDatosPrimitivos(); //llamo el submenu creado
                        subMenu = scanner.nextInt();
                        switch (subMenu) {
                            case 1:
                                Detalle.explicacionDatosPrimitivos(); // se llama desde Detalle, lo que se copio
                                scannerEnter.nextLine();
                                break;
                            case 2:
                                Ejercicios.programaDatosPrimitivos(scanner); // se trae el copiado en Ejercicios
                                scannerEnter.nextLine();
                                break;
                            case 3:
                                Ejemplos.ejemplosDatosPrimitivos(); // se trae lo copiado en Ejemplos
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
                        SubMenus.opcionesString(); // lo llamo de Submenus
                        subMenu = scanner.nextInt();
                        switch (subMenu) {
                            case 1:
                                Detalle.explicacionString(); // lo llamo de Detalle
                                scannerEnter.nextLine();
                                break;
                            case 2:
                                Ejemplos.ejemploString(); // lo llamo de Ejemplos
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
                       SubMenus.opcionConstantes(); // lo llamo de Submenus
                        subMenu = scanner.nextInt();

                        switch (subMenu) {
                            case 1:
                               Detalle.explicacionConstantes(); // se llama desde Detalles
                                scannerEnter.nextLine();
                                break;
                            case 2:
                                Ejemplos.ejemploConstantes();
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
                        SubMenus.opcionTipodeOperadores();
                        subMenu = scanner.nextInt();

                        switch (subMenu) {
                            case 1:
                                Detalle.explicacionAritmeticos();
                                scannerEnter.nextLine();
                                break;

                            case 2:
                                Detalle.explicacionComparacion();
                                scannerEnter.nextLine();
                                break;

                            case 3:
                                Detalle.explicacionAsignacion();
                                scannerEnter.nextLine();
                                break;

                            case 4:
                                Detalle.explicacionLogicos();
                                scannerEnter.nextLine();
                                break;

                            case 5:
                                Detalle.explicacionUnarios();
                                scannerEnter.nextLine();
                                break;

                            case 6:
                                Detalle.explicacionCondicionalTernario();
                                scannerEnter.nextLine();
                                break;

                            case 7:
                                Detalle.explicacionTipo();
                                scannerEnter.nextLine();
                                break;

                            case 8:
                                Detalle.explicacionBitaBit();
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
                        SubMenus.opcionCondicionalIfElse();
                        subMenu = scanner.nextInt();
                        switch (subMenu) {
                            case 1:
                               Detalle.explicacionEstructuraIf();
                                scannerEnter.nextLine();
                                break;
                            case 2:
                                Detalle.explicacionEstructuraif_else();
                                scannerEnter.nextLine();
                                break;
                            case 3:
                                Detalle.explicacionEstructuraif_else_ifelse();
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