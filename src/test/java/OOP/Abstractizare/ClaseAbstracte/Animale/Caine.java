package OOP.Abstractizare.ClaseAbstracte.Animale;

public class Caine extends Animale {
    private String rasa;

    @Override
    public void scoateSunet() {
        System.out.println("Cainele latra!");
    }

    @Override
    public void prezentareAnimal() {
        System.out.println("\n----------");
        System.out.println("Acest caine face parte din rasa: " + rasa + ". Cainele are " + getGreutate() + " kilograme.");
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }
}
