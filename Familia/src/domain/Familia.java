/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Scanner;

/**
 *
 * @author Joabp
 */
public class Familia {

    public Object fam[][][];

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("¿Cuántos hermanos y hermanas tiene tu mamá?");
        int m = c.nextInt();
        System.out.println("¿Cuántos hermanos y hermanas tiene tu papá?");
        int p = c.nextInt();
        Matriz matriz = new Matriz(2, mayor(m, p));
        for (int i = 0; i < m; i++) {
            boolean bandera = false;
            int j = 0;
            do {
                System.out.println("Ingrese nombre del " + Integer.toString(j + 1) + "° hijo del " + Integer.toString(i + 1) + "° herman@ de tu mamá: (0) para salir");
                String nombre = c.next();
                if (nombre.equals("0")) {
                    bandera = true;
                }
                else {
                    matriz.llenaMatriz(0, i, j, nombre);
                    j++;
                }
            } while (bandera != true);
        }
        for (int i = 0; i < p; i++) {
            boolean bandera = false;
            int j = 0;
            do {
                System.out.println("Ingrese nombre del " + Integer.toString(j + 1) + "° hijo del " + Integer.toString(i + 1) + "° herman@ de tu papá: (0) para salir");
                String nombre = c.next();
                if (nombre.equals("0")) {
                    bandera = true;
                }
                else {
                    matriz.llenaMatriz(1, i, j, nombre);
                    j++;
                }
            } while (bandera != true);
        }
        System.out.println();
        System.out.println("---------------Familia de tu mamá------------");
        System.out.println("Num herman@         Nombre hij@");
        for (int i = 0; i < m; i++) {
            System.out.print("  " + Integer.toHexString(i + 1) + "  ");
            for (int j = 0; j < matriz.lengthZ(0, i); j++) {
                String nombre = (String) matriz.regresarObjeto(0, i, j);
                if (nombre != null) {
                    System.out.print("    " + nombre);
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("---------------Familia de tu papá------------");
        System.out.println("Num herman@         Nombre hij@");
        for (int i = 0; i < p; i++) {
            System.out.print("  " + Integer.toHexString(i + 1) + "  ");
            for (int j = 0; j < matriz.lengthZ(1, i); j++) {
                String nombre = (String) matriz.regresarObjeto(1, i, j);
                if (nombre != null) {
                    System.out.print("    " + nombre);
                }
            }
            System.out.println();
        }
    }

    private static int mayor(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }

}
