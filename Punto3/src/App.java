/*
 * Alejandro Sierra Betancourt 
 * 2259559
 * Juan Manuel Ramirez Agudelo 
 * 2259482
 * Juan Pablo Castaño Arango
 * 2259487
 */

import java.util.LinkedList;
import java.util.Scanner;

public class App{
    public static void encontrarOcurrencias(String palabra, char letra) {
        LinkedList<Integer> ocurrencias = new LinkedList<>();

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
            ocurrencias.add(i);
            }
        }

        if (!ocurrencias.isEmpty()) {
            int primero = ocurrencias.getFirst();
            int ultimo = ocurrencias.getLast();
            System.out.println("Primera ocurrencia de " + letra + ": " + primero);
            System.out.println("Última ocurrencia de " + letra + ": " + ultimo);
        } 
        else {
            System.out.println("La letra " + letra + " no se encuentra en la palabra.");
        }
    }

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese una palabra: ");
    String palabra = scanner.nextLine();
    System.out.print("Ingrese la letra a buscar: ");
    char letra = scanner.next().charAt(0);
    encontrarOcurrencias(palabra, letra);
    scanner.close();
   }
}
