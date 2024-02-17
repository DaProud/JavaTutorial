package OOP.Session20NonAccessModifiers.ValueVsReferenceType.ex2;

public class MainRefTest {

    public static void main(String[] args) {
        RefTest ref1 = new RefTest();
        System.out.println(ref1);

        RefTest ref2 = new RefTest();
        System.out.println(ref2);

        if (ref1 == ref2) {
            System.out.println("egale");
        } else {
            System.out.println("NU sunt egale");
        }

    }

}
