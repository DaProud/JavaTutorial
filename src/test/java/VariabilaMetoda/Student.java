package VariabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    // Clasa = Sablon care defineste proprietatile si comportamentul unei entitati specifice

    // Intr-un fisier java putem avea mai multe clase diferentiate pe baza numelui (nu este un practice bun
    // sa avem mai multe clase cu acelasi nume)

    // Intr-o clasa putem defini proprietatile si actiunile entitatii

    // Variabila = Proprietatea unei clase

    // Variabilele pot sa fie de 2 feluri: globala si locala
    // Variabilele globale = sunt vizibile pest tot in proiect
    // Variabilele locale = sunt vizibile doar in locul unde le-am declarat
    // Ca sa definim o variabila globala: access_control(public)  tip_variabila  nume_variabila

    // In momentul cand definim o variabila nu este obligatoriu sa ii dam o valoare


    // metoda = actiunea unei clase
    // exista 2 tipuri de metode: void si return

    public String nume;
    public String prenume;
    public Integer varsta;
    public String adresa;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areDiploma;

    @Test
    public void prezentareStudent() {
        nume = "Mindru";
        prenume = "Daniel";
        varsta = 35;
        adresa = "Str. Bucuriei";
        inaltime = 1.90;
        greutate = 92f;
        sex = 'M';
        areDiploma = true;

        //System.out.println(nume + " " + prenume + ": " + varsta + " " + adresa);
        //System.out.println(inaltime);

        System.out.println("Numele studentului este: " + nume);
        System.out.println("Prenumele studentului este: " + prenume);
        System.out.println("Varsta studentului este: " + varsta);
        System.out.println("Adresa studentului este: " + adresa);
        System.out.println("Inaltimea studentului este: " + inaltime);
        System.out.println("Greutatea studentului este: " + greutate);
        System.out.println("Sexul studentului este: " + sex);
        System.out.println("Studentul are diploma?: " + areDiploma);

        calculMedie();

        System.out.println("Salariul: " + getSalariu());
    }

    public void calculMedie() {
        Integer nota1 = 8;
        Integer nota2 = 6;
        Integer nota3 = 5;
        Integer medie = (nota1 + nota2 + nota3) / 3;

        System.out.println("Media Studentului: " + medie);
    }

    // Metoda cu return
    public Integer getSalariu() {
        Integer salariu = 50000;
        return salariu;
    }

}
