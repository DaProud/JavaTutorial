package OOP;

import org.testng.annotations.Test;

public class OOPTest {

    @Test
    public void metodaTest(){
        Student Cristi = new Student("Pop", "Cristi", 25, "UBB", "2", true);
//        Cristi.infoStudent();
        Cristi.infoPersoana();
//        Cristi.mananca();

        Angajat Tudor = new Angajat("Moldovan", "Raul", 30, "Endava", 5, 30);
//        Tudor.setZileConcediu(25);
        Tudor.infoAngajat();
//        Tudor.promovare();
//        Tudor.mananca();

        Tudor.marire();
        Tudor.marire(15);
        Tudor.marire("Sef");
        Tudor.firma = "Endava";

        Tudor.infoPersoana();

//        AngajatStudent Marcel = new AngajatStudent();
//        Marcel.


    }

}
