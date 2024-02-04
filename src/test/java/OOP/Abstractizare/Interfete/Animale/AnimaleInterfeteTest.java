package OOP.Abstractizare.Interfete.Animale;

import org.testng.annotations.Test;

public class AnimaleInterfeteTest {

    @Test
    public void metodaTest() {
        System.out.println("\n----------");
        Girafa girafa = new Girafa(250);
        girafa.prezentareAnimal();
        girafa.scoateSunet();
        girafa.mananca();

        System.out.println("\n----------");
        Zebra zebra = new Zebra();
        zebra.setGreutate(300);
        zebra.setInaltime(2.5);
        zebra.prezentareAnimal();
        zebra.scoateSunet();
        zebra.mananca();

        System.out.println("\n----------");
        Leu leu = new Leu();
        leu.setGreutate(2000);
        leu.prezentareAnimal();
        leu.scoateSunet();
        leu.mananca();
        leu.vaneaza();
    }
}
