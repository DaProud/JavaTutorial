package OOP.Session20NonAccessModifiers.StaticAccessModifiers.ex1;

public class TestAccessModifiers {

    public static void main(String[] args) {
        StaticAccessModifiers staticAccessModifiers = new StaticAccessModifiers();

        System.out.println(staticAccessModifiers.name);
////        staticAccessModifiers.printMessage();
//        staticAccessModifiers.name = "New Endava";
//        System.out.println(staticAccessModifiers.name);
        StaticAccessModifiers.name = "new endava";
        System.out.println(StaticAccessModifiers.name);
        StaticAccessModifiers.printMessage();

        StaticAccessModifiers staticAccessModifiers2 = new StaticAccessModifiers();
        System.out.println(StaticAccessModifiers.name);
//        staticAccessModifiers2.name = "New Endava";
//        System.out.println(staticAccessModifiers2.name);
    }

}
