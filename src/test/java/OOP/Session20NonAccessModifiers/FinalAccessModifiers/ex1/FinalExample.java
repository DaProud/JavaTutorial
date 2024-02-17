package OOP.Session20NonAccessModifiers.FinalAccessModifiers.ex1;

public class FinalExample {

    // Keywordul "final" poate fi aplicat pentru outer class, inner class, variabile/field si metode
    // NU poate fi aplicat la interfete, constructor, blocks si enum-uri!

    // final class - nu poate fi extinsa/mostenita
    // final method - nu poate fi suprascrisa
    // o variabila declarata si initializata - nu poate fi schimbata

    static final int ROTI_MASINA = 4;
    static int a = 123;

    public static void main(String[] args) {
        System.out.println("a = " + a);
        a = a + 1;
        a++;
        System.out.println("a = " + a);

        System.out.println("Roti masina: " + ROTI_MASINA);
    }


}
