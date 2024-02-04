package OOP.Abstractizare.Interfete.Animale;

import OOP.Abstractizare.ClaseAbstracte.Animale.Animale;

public class Zebra extends Animale implements ComportamentAnimale {
    @Override
    public void scoateSunet() {
        System.out.println("Zebra face si ea un sunet. :) ");
    }

    @Override
    public void prezentareAnimal() {
        System.out.println("Zebra are dungi albe cu negre");
    }

    @Override
    public void mananca() {
        System.out.println("Zebra mananca iarba");
    }
}
