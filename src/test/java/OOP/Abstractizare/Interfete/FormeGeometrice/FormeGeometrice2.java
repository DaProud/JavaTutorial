package OOP.Abstractizare.Interfete.FormeGeometrice;

public interface FormeGeometrice2 {
    public static final String culoare = "verde"; // permite doar constante, nu si fielduri/proprietati care nu sunt initializate
    // toate metodele declarate sunt abstracte;
    void calculeazaAria();
    void deseneaza();
    void metodaImplementata();
}
