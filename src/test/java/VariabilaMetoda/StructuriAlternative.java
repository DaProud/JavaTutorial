package VariabilaMetoda;

import org.testng.annotations.Test;

public class StructuriAlternative {

    // structuri alternative = if-then-else; switch-case

    @Test
    public void metodaTest() {
//        metodaVerificareNumar(8);
//        metodaVerificareNumar(4);
//        metodaVerificareNumar(5);

//        metodaVerificareNumarParPozitiv(6);
//        metodaVerificareNumarParPozitiv(7);
//
//        metodaVerificareNumarParPozitiv(-6);
//        metodaVerificareNumarParPozitiv(-7);
//
//        metodaVerificareNumarParPozitiv(0);

        zileSaptamana(3);
    }

    // verificam daca un numar e mai mare decat 5
    public void metodaVerificareNumar(int numar) {
        if (numar > 5) {
            System.out.println("numarul " + numar + " este mai mare decat 5");
        } else if (numar < 5) {
            System.out.println("numarul " + numar + " este mai mic decat 5");
        } else {
            System.out.println("numarul " + numar + " este egal cu 5");
        }
    }

    // verificam daca un numar e par pozitiv sau par negativ
    public void metodaVerificareNumarParPozitiv(int valoare) {
        if (valoare > 0) {
            if (valoare % 2 == 0) {
                System.out.println("Numarul " + valoare + " este par pozitiv!");
            } else {
                System.out.println("Numarul " + valoare + " este impar pozitiv!");
            }
        }
        else if (valoare < 0) {
            if (valoare % 2 == 0) {
                System.out.println("Numarul " + valoare + " este par negativ!");
            } else {
                System.out.println("Numarul " + valoare + " este impar negativ!");
            }
        } else {
            System.out.println("Numarul " + valoare + " este Zero!");

        }
    }

    // Exemplu switch-case
    public void zileSaptamana(Integer zi) {
        switch (zi) {
            case 1:
                System.out.println("Astazi este Luni");
                break;
            case 2:
                System.out.println("Astazi este Marti");
                break;
            case 3:
                System.out.println("Astazi este Miercuri");
                break;
            case 4:
                System.out.println("Astazi este Joi");
                break;
            default:
                System.out.println(zi + " Nu este o zi a saptamanii :)");
        }
    }

}
