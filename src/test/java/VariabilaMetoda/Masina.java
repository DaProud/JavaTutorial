package VariabilaMetoda;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Masina {

    public String marca;
    public String model;
    public Integer anFabricatie;

    @Test
    public void metodaTest() {
//        dateMasina("Audi", "A4", 2023);
//        dateMasina("BMW", "X6", 2023);
//
//        calculMedie(5.0, 10.0);
//        calculMedie(7.0, 8.0);
    }

    public void dateMasina(String param1, String param2, Integer param3) {
        marca = param1;
        model = param2;
        anFabricatie = param3;

        System.out.println("Marca masinii: " + marca);
        System.out.println("Modelul: " + model);
        System.out.println("Anul de fabricatie: " + anFabricatie);
    }

    // Calculam media la 2 numere
    public void calculMedie(Double nota1, Double nota2) {
        double suma = nota1 + nota2;
        double rezultat = suma / 2;
        System.out.println("Media: " + rezultat);
    }




}
