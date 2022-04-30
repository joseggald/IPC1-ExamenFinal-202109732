package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int op;
        String a, res;
        a="";
        int[] n= new int[10];
        Scanner leer = new Scanner(System.in);
        System.out.println("***** BIENEVENIDO AL EXAMEN FINAL *****");
        System.out.println("***** 202109732 - Jose Eduardo Galdamez Gonzalez*****");
        res="y";

        do {
            System.out.println("Seleccione el programa: ");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("***** Ejercicio 1 *****");
                    System.out.println("Ingrese 2 numeros enteros de diferente valor: ");
                    System.out.println("Numero 1: ");
                    n[1] = leer.nextInt();
                    System.out.println("Numero 2: ");
                    n[2] = leer.nextInt();

                    if (n[1] > n[2]) {
                        System.out.println("El numero 1: " + n[1] + " es mayor al numero 2: " + n[2]);
                    } else if (n[1] < n[2]) {
                        System.out.println("El numero 2: " + n[2] + " es mayor al numero 1: " + n[1]);
                    } else if (n[1] == n[2]) {
                        System.out.println("El numero 2: " + n[2] + " es igual al numero 1: " + n[1]);
                    }
                    a="a";

                    break;

                case 2:
                    System.out.println("***** Ejercicio 2 *****");
                    int lim, k=0;
                    do {
                        System.out.println("Ingrese un numero impar para la piramide: ");
                        lim = leer.nextInt();
                        if(lim%2==0){
                            System.out.println("**** SOLO SE ADMITEN NUMEROS IMPARES ****");
                        }
                    }while(lim%2==0);
                    for (int i = 1; i <= lim; ++i, k = 0) {
                        for (int j = 1; j <= lim - i; ++j) {
                            System.out.print("  ");
                        }

                        while (k != 2 * i - 1) {
                            System.out.print("* ");
                            ++k;
                        }

                        System.out.println();
                    }
                    a="a";
                    break;
                case 3:
                    System.out.println("***** Ejercicio 3 *****");
                    int vacas, camion, sumaLitros=0, sumaPeso=0;
                    String pesoVaca,litros;
                    System.out.println("Ingrese el total de vacas disponibles:");
                    vacas= leer.nextInt();
                    System.out.println("Ingrese el peso del camion:");
                    camion= leer.nextInt();
                    System.out.println("Ingrese el peso de las vacas:");
                    pesoVaca= leer.next();
                    System.out.println("Ingrese los litros de las vacas:");
                    litros= leer.next();
                    String[] partesVacas = pesoVaca.split(",");
                    String[] partesLitros = litros.split(",");
                    int[] vacasArray = new int[100];
                    int[] litrosArray = new int[100];

                    for (int i=0; i<vacas; i++){
                        vacasArray[i]=Integer.valueOf(partesVacas[i]);
                        litrosArray[i]=Integer.valueOf(partesLitros[i]);
                        sumaLitros=litrosArray[i]+sumaLitros;

                        sumaPeso=sumaPeso+vacasArray[i];

                    }

                    System.out.println("*** DATOS ***");
                    System.out.println("Vacas Disponibles: " + vacas);
                    System.out.println("Peso limite del camion: " + camion);
                    System.out.println("Peso de las vacas: "+ pesoVaca);
                    System.out.println("Litros generados por las vacas: "+ litros);
                    System.out.println();
                    System.out.println("******************************************");
                    System.out.println();
                    if(sumaPeso<=camion){
                        System.out.println("El total de litros es: " + sumaLitros);
                    }else if(sumaPeso>camion){
                        System.out.println("Error, el peso de las vacas es mayor o igual al camion. ");
                        System.out.println("Total del peso de vacas: "+sumaPeso);
                    }
                    a="a";
                    break;
                default:
                    System.out.println("Opcion No valida, elija otra opción.");

            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Desea volver a iniciar el programa?");
            System.out.println("si=y o no=n");
            res = leer.next();

            if(res.equals("n") || res.equals("N")){
                a="b";
            }else if(res.equals("y") || res.equals("Y")){
                a="a";
            }

        }while (a.equals("a"));
    }
}
