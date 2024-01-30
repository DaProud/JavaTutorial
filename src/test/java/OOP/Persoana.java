package OOP;

public class Persoana {

    // OOP = Programare Orientata Obiect
    // 4 Principii: mostenire, incapsulare, polimorfism, abstractizare
    // Mostenire = conceptul prin care o clasa (copil) mosteneste o alta clasa (parinte)
    // In Java, putem mosteni o singura clasa
    // In momentul in care o clasa mosteneste o alta clasa, clasa copil trebuie sa apeleze
    // constructorul din parinte
    // In momentul in care se aplica mostenirea, copilul are
    // vizibilitate asupra variabilelor/metodelor din parinte
    // Constructorul din parinte in copil se apeleaza cu "super"

    // INCAPSULARE: Procesul prin care tinem departe anumite informatii ca ele sa nu poata fi modificate
    // facem variabilele/metodele din public in private
    // private = access control care restrictioneaza accesul doar in clasa respectiva
    // ca sa extragem/modificam o valoare a unei variabile private, ne folosim de metode get/set

    private String nume;
    private String prenume;
    private Integer varsta;

    public Persoana(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana(){
        System.out.println("Numele este: " + nume);
        System.out.println("Prenumele este: " + prenume);
        System.out.println("Varsta este: " + varsta);
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }
}
