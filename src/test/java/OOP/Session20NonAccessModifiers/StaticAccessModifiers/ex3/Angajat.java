package OOP.Session20NonAccessModifiers.StaticAccessModifiers.ex3;

public class Angajat {

    static int numarAngajat = 0;

    public void numarAngajat() {
        numarAngajat = numarAngajat + 1;
        System.out.println("Numar angajati: " + numarAngajat);
    }

}
