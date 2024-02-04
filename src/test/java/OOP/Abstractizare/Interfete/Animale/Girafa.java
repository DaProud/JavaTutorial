package OOP.Abstractizare.Interfete.Animale;

import OOP.Abstractizare.ClaseAbstracte.Animale.Animale;

public class Girafa extends Animale implements ComportamentAnimale {
    private final Integer greutateInKilograme;

    public Girafa(Integer greutateInKilograme) {
        this.greutateInKilograme = greutateInKilograme;
    }

    @Override
    public void scoateSunet() {
        System.out.println("Girafa nu prea scoate sunete...");
    }

    @Override
    public void prezentareAnimal() {
        System.out.println("Girafa cantareste " + greutateInKilograme + " kilograme");
    }

    @Override
    public void mananca() {
        System.out.println("Girafa mananca de la inaltime :)");
    }
}
