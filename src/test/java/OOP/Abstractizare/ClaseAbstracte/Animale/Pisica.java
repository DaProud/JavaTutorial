package OOP.Abstractizare.ClaseAbstracte.Animale;

public class Pisica extends Animale {
    private String rasa;

    @Override
    public void scoateSunet() {
        System.out.println("Pisica miauna. :)");
    }

    @Override
    public void prezentareAnimal() {
        System.out.println("\n----------");
        System.out.println("Pisica face parte din rasa " + rasa);
        if (getGreutate() != null) {
            System.out.println("Pisica cantareste " + getGreutate() + "kilograme.");
        }
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }
}
