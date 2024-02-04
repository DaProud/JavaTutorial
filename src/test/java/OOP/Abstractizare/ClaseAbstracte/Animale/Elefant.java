package OOP.Abstractizare.ClaseAbstracte.Animale;

public class Elefant extends Animale{
    @Override
    public void scoateSunet() {
        System.out.println("Elefantul scoate sunet cu trompa. :)");
    }

    @Override
    public void prezentareAnimal() {
        System.out.println("\n----------");
        System.out.println("Elefantul are " + getGreutate() + " kilograme.");
    }

}
