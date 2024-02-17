package OOP.Session20NonAccessModifiers.SynchronizedExample;

public class Counter {

    // "synchronized" este folosit pentru thread safety
    // synchronized poate fi aplicat la metode si blocks
    //

    int count;

    synchronized void increment() {
        count++;
    }

}
