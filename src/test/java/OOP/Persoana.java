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

    // POLIMORFISM: procesul prin care definim mai multe implementari pentru o metoda
    // Poate sa fie de 2 feluri: dinamic (override) si static (overload)
    // Polimorfism dinamic = intr-o ierarhie de clase obtinute prin mostenire, o metoda poate avea implementari diferite
    // Polimorfism static = posibilitatea prin care o metodare are mai multe implementari
    //    prin diferentierea tipului sau numarului de parametri

    // ABSTRACTIZAREA = reducerea unui element complex la un element mai simplu (reducerea completa a
    // implementarii metodelor lasand doar numele functiilor, parametri daca exista si tipul returnat)
    // Abstractizarea se poate obtine prin clase abstracte si/sau prin interfete
    // Clasele abstracte sunt utilizate petnru a declara caracteristice comune ale unor sublcase
    // o clasa abstracta nu poate fi instantiata
    // ea poate fi utilizata numar ca super clasa pentru alte clase care
    // extind clasa abstracta (clasa abstracta e definita folosing modiificatorul/cuvantul cheie abstract)
    // o clasa abstracta poate contine atribute si metode pe langa clasa abstracta

    // Interfata ofera raspuns lipsei mostenirii multiple
    // Interfata creaza un protocol pe care clasele trebuie sa il implementeze
    // Interfata contine toate metodele abstracte (e o clasa pur abstracta)

    private String nume;
    private String prenume;
    private Integer varsta;

    public Persoana(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana() {
        System.out.println("Numele este: " + nume);
        System.out.println("Prenumele este: " + prenume);
        System.out.println("Varsta este: " + varsta);
    }

    // Definim prima implementare pentru o metoda (polimorfim dinamic)
    public void mananca() {
        System.out.println("Persoana mananca cand ii este foame.");
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }
}
