package OOP.Session20NonAccessModifiers.StaticAccessModifiers.ex3;

public class AngajatTest {

    public static void main(String[] args) {
        System.out.println("Numar Initial de Angajati: " + Angajat.numarAngajat);

        Angajat angajat= new Angajat();
        angajat.numarAngajat();

        Angajat angajat2 = new Angajat();
        angajat2.numarAngajat();
    }

}
