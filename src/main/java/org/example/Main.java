package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        citireNote();
        printareValoriFolosindWhile();
        printareValoriFolosindDoWhile();
        printareValoriFolosindFor();
    }

    public static void citireNote() {
        System.out.print("Introduceti nota: ");
        Scanner scanner = new Scanner(System.in);
        int nota = scanner.nextInt();
        while (nota <= 0 || nota > 10) {
            System.out.println(":(  -> Nota trebuie sa fie intre 1 si 10. Te rog introdu o valoare valida. :)");
            nota = scanner.nextInt();
        }
        System.out.println(":)   -> Nota valida introdusa: " + nota + " (este intre 1 si 10)");
    }

    public static void printareValoriFolosindWhile() {
        System.out.println("Folosind While: \n");
        int valoare = 6;
        while (valoare <= 5) {
            System.out.println("Valoare: " + valoare);
            valoare++;
        }
        System.out.println("Valoarea finala dupa while -> valoare = " + valoare);

    }

    public static void printareValoriFolosindDoWhile() {
        System.out.println("Folosind Do-While: \n");
        int valoare = 6;
        do {
            System.out.println("Valoare: " + valoare);
            valoare++;
        } while (valoare <= 5);
        System.out.println("Valoarea finala dupa do-while -> valoare = " + valoare);
    }

    public static void printareValoriFolosindFor() {
        System.out.println("Folosind For: \n");
        // Variatie 1:
        int ceva = 1;
        for (int valoare = 1; valoare <= 5; valoare++) {
            System.out.println("Valoare: " + valoare);
            ceva = valoare;
        }
        System.out.println("Valoarea finala dupa For -> valoare = " + ceva);

        // Variatie 2:
        int valoare = 1;
        for (; valoare <= 5; ) {
            System.out.println("Valoare: " + valoare);
            valoare++;
            ceva = valoare;
        }
        System.out.println("Valoarea finala dupa For -> valoare = " + ceva);

    }

}