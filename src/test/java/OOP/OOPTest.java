package OOP;

import org.testng.annotations.Test;

public class OOPTest {

    @Test
    public void metodaTest(){
        Student Cristi = new Student("Pop", "Cristi", 25, "UBB", "2", true);
        Cristi.infoStudent();

        Angajat Tudor = new Angajat("Moldovan", "Raul", 30, "Endava", 5, 30);
        Tudor.infoAngajat();

        Tudor.promovare();
    }

}