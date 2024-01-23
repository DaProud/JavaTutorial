package Exceptii;

public class Exceptia1 {

    // Exceptiile reprezinta situatii care apar in timpul executiei unui program
    // care determina oprirea acestuia.
    // Ofera un mecanism eficient de identificare si rezolvare a erorilor
    // Sunt modelate sub forma de clase: clasa Error, clasa Exception, RuntimeException
    // De asemenea si clase personalizate;
    // Exceptii sunt gestionate folosind cuvinte predefinite in Java: try-catch-finally
    // Sunt 2 tipuri mari de exceptii: Checked si Unchecked
    // Erorile checked : sunt exceptii de compilare (nu poti sa build-uiesti/rulezi programul)
    // Exemple: SQLException, IOException (IO = Input-Output), ClassNotFoundException
    //
    // Erorile unchecked: sunt exceptii de runtime, care sunt ignorate in timpul compilarii,
    // dar sunt aruncate in timpul executiei programului
    // Exemple: NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException
    // "throw": este un cuvant cheie care arunca exceptia in mod explicit de la o metoda sau un block de cod;
    // "throws":  este un cuvant cheie care se foloseste odata cu metoda care poate arunca un tip
    // sau mai multe de exceptii;

    public static void main(String[] args) throws ExceptieCustom{
//        try {
//            System.out.println(12 / 0);
//        } catch (ArithmeticException e) {
//            System.out.println("Error Arithmetic Exception thrown:" + e.getMessage());
//        }

        try {
            int[] numbers = new int[10];
            numbers[10] = 100;
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
            throw new ExceptieCustom("Eroare personalizata!");
        } finally {
            System.out.println("Aceasta linie se executa indiferent daca exceptia este prinsa sau nu. :)");
        }

        System.out.println("\n***** End of program here... :) *****");

    }


}
