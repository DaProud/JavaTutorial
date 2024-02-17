package OOP.Session20NonAccessModifiers.ValueVsReferenceType;

public class ReferenceType {


    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        String str3 = str1;

        if (str1 == str2) {
            System.out.println("Valorile sunt la fel");
        } else {
            System.out.println("Valorile NU sunt la fel");
        }

        System.out.println("----------------------------");

        int intreg1 = 5;
        int intreg2 = 5;

        if (intreg1 == intreg2) {
            System.out.println("Valorile sunt la fel");
        } else {
            System.out.println("Valorile NU sunt la fel");
        }

    }
}
