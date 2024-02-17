package OOP.Session20NonAccessModifiers.TestsDanielHomework;

public class Avion {
    private static int numarAvioane =0;
    public static final String NUME_COMPANIE = "LUFTANSA";

    static {
        System.out.println("Block static");
    }

    private String numeAvion;
    private Integer capacitateAvion;

    private Avion() {
        System.out.println("Constructor fara parametri");
        numarAvioane = getNumarAvioane() + 1;
    }

    public Avion(String numeAvion) {
        this();
        System.out.println("Constructor cu un parametru");
        this.numeAvion = numeAvion;
    }

    public Avion(String numeAvion, Integer capacitateAvion) {
        this(numeAvion);
        System.out.println("Constructor cu doi parametri");
        this.capacitateAvion = capacitateAvion;
    }

    public static synchronized int getNumarAvioane() {
        return numarAvioane;
    }

    public static void afisareNumarAvioane() {
        System.out.println("\n### Avioane in flota: " + numarAvioane + "\n");
    }

    public Integer getCapacitateAvion() {
        return capacitateAvion;
    }

    public void setCapacitateAvion(Integer capacitateAvion) {
        this.capacitateAvion = capacitateAvion;
    }

    public String getNumeAvion() {
        return numeAvion;
    }

    public void setNumeAvion(String numeAvion) {
        this.numeAvion = numeAvion;
    }

    public void prezentareAvion() {
        System.out.println("Avion: " + numeAvion);
    }
}
