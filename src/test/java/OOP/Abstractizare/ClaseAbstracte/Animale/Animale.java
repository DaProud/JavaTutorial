package OOP.Abstractizare.ClaseAbstracte.Animale;

public abstract class Animale {
    private Integer greutate;
    private Double inaltime;
    private Double lungime;

    public abstract void scoateSunet();

    public abstract void prezentareAnimal();

    public Integer getGreutate() {
        return greutate;
    }

    public void setGreutate(Integer greutate) {
        this.greutate = greutate;
    }

    public Double getInaltime() {
        return inaltime;
    }

    public void setInaltime(Double inaltime) {
        this.inaltime = inaltime;
    }

    public Double getLungime() {
        return lungime;
    }

    public void setLungime(Double lungime) {
        this.lungime = lungime;
    }
}
