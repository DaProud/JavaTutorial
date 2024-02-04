package OOP.Abstractizare.ClaseAbstracte.FormeGeometrice;

public class Patrat extends FormeGeometrice {

    private int latura;

    @Override
    public void calculeazaAria() {
        System.out.println("Aria patratului este: " + latura * latura);
    }

    public int getLatura() {
        return latura;
    }

    public void setLatura(int latura) {
        this.latura = latura;
    }
}
