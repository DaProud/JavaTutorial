package OOP.Session20NonAccessModifiers.TestsDanielHomework;

import java.util.ArrayList;
import java.util.List;

public class AvionTest {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("***********************");
        System.out.println("***** " + Avion.NUME_COMPANIE + " *****");
        System.out.println("***********************");
        System.out.println();

        // Folosire valori static prin constructor:
        Avion boeing = new Avion("Boeing");
        Avion.afisareNumarAvioane();

        Avion hawker = new Avion("Hawker");
        Avion.afisareNumarAvioane();

        Avion f16 = new Avion("F-16");
        Avion.afisareNumarAvioane();

        Avion mig32 = new Avion("MIG-32", 199);
        Avion.afisareNumarAvioane();

        // Synchronized:

        List<Avion> listaAvioane = new ArrayList<>();

        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                Avion avion = new Avion("Boeing-" + i);
                System.out.println("Avion nou: " + avion.getNumeAvion());
                listaAvioane.add(avion);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 2001; i <= 3000; i++) {
                Avion avion = new Avion("Mig-" + i);
                System.out.println("Avion nou: " + avion.getNumeAvion());
                listaAvioane.add(avion);
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Avion.afisareNumarAvioane();

        System.out.println("Lista Avioane:");

        for (Avion avion : listaAvioane) {
            avion.prezentareAvion();
        }
    }

}
