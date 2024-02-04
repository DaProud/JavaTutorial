package OOP.Abstractizare.ClaseAbstracte.Animale;

import org.testng.annotations.Test;

public class AnimaleClaseAbstracteTest {

    @Test
    public void metodaTest(){
        Caine caine = new Caine();
        caine.setRasa("Chihuahua");
        caine.setGreutate(10);
        caine.prezentareAnimal();
        caine.scoateSunet();

        Pisica pisica = new Pisica();
        pisica.setRasa("Bengaleză");
        pisica.prezentareAnimal();
        pisica.scoateSunet();

        Elefant elefant = new Elefant();
        elefant.setGreutate(3000);
        elefant.prezentareAnimal();
        elefant.scoateSunet();
    }

}
