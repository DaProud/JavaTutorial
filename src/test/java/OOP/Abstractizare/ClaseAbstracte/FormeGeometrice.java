package OOP.Abstractizare.ClaseAbstracte;

public abstract class FormeGeometrice {

    // clasele abstracte pot sa aiba si metode generice si metode implementate

    public String culoare;

    public abstract void calculeazaAria();

    public void deseneaza() {
        System.out.println("Deseneaza forma");
    }

}
