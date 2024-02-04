package OOP.Abstractizare.Interfete.Animale;

import OOP.Abstractizare.ClaseAbstracte.Animale.Animale;

public class Leu extends Animale implements ComportamentAnimale, ComportamentFeline{
    @Override
    public void scoateSunet() {
        System.out.println("Leul rage tare. :)");
    }

    @Override
    public void prezentareAnimal() {
        System.out.println("Leul este regele junglei!");
    }

    @Override
    public void mananca() {
        System.out.println("Leul mananca alte animale.");
    }

    @Override
    public void vaneaza() {
        System.out.println("Leul vaneaza gazele. :)");

    }
}
