package OOP.Session20NonAccessModifiers.StaticAccessModifiers.ex2;

public class InitializerBlockTest {

    static {
        System.out.println("Setting field");
//        name = "Test";
    }

    private String name = "Ana";

    public InitializerBlockTest() {
        name = "Serena";
        System.out.println("setting constructor");
    }

    public static void main(String[] args) {
        InitializerBlockTest test = new InitializerBlockTest();
        System.out.println(test.name);

        InitializerBlockTest test2 = new InitializerBlockTest();
        System.out.println(test2.name);
    }
}
