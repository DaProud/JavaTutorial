package OOP.Session20NonAccessModifiers.StaticAccessModifiers.ex1;

public class StaticAccessModifiers {

    // STATIC
    // Modificatorul STATIC = poate fi aplicat la nivel de variabila, metoda,
    // bloc de initializare, la inner class sau inner interface
    // Cuvantul static se poate apela prin numele clasei, de ex. NumeClasa.proprietate sau NumaClasa.metoda
    // Beneficiu -> Eficienta la folosirea memoriei

    static String name = "ENDAVA";

    public static void printMessage(){
        System.out.println("Printeaza metoda");
    }

}
