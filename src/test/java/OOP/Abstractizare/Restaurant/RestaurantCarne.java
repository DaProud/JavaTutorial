package OOP.Abstractizare.Restaurant;

public class RestaurantCarne extends Restaurant implements RestaurantCarneInt {

    private Boolean servesteCarneDePui;
    private Boolean servestePeste;
    private Boolean servesteCarneDeVita;
    private Boolean servesteCarneDeCurcan;

    public RestaurantCarne(String numeRestaurant, Integer numarMaximLocuri, String tipRestaurant, Boolean servesteCarneDePui, Boolean servesteCarneDeCurcan, Boolean servestePeste, Boolean servesteCarneDeVita) {
        super(numeRestaurant, numarMaximLocuri, tipRestaurant);
        this.servesteCarneDePui = servesteCarneDePui;
        this.servesteCarneDeCurcan = servesteCarneDeCurcan;
        this.servestePeste = servestePeste;
        this.servesteCarneDeVita = servesteCarneDeVita;
    }

    public RestaurantCarne(String numeRestaurant, Integer numarMaximLocuri, String tipRestaurant) {
        super(numeRestaurant, numarMaximLocuri, tipRestaurant);
    }

    @Override
    public void livreazaLaDomiciliu() {
        System.out.println("Restaurantul " + getNumeRestaurant() + " cu specific de carne livreaza la domiciliu");
    }

    @Override
    public void servesteCarneDePui() {
        if (servesteCarneDePui) {
            System.out.println("Restaurantul " + getNumeRestaurant() + " serveste carne de pui");
        } else {
            System.out.println("Restaurantul " + getNumeRestaurant() + " NU serveste carne de pui");
        }
    }

    @Override
    public void servesteCarneDeVita() {
        if (servesteCarneDeVita) {
            System.out.println("Restaurantul " + getNumeRestaurant() + " serveste carne de vita");
        } else {
            System.out.println("Restaurantul " + getNumeRestaurant() + " NU serveste carne de vita");
        }
    }

    @Override
    public void servesteCarneDeCurcan() {
        if (servesteCarneDeCurcan) {
            System.out.println("Restaurantul " + getNumeRestaurant() + " serveste carne de curcan");
        } else {
            System.out.println("Restaurantul " + getNumeRestaurant() + " NU serveste carne de curcan");
        }
    }

    @Override
    public void servestePeste() {
        if (servestePeste) {
            System.out.println("Restaurantul " + getNumeRestaurant() + " serveste peste");
        } else {
            System.out.println("Restaurantul " + getNumeRestaurant() + " NU serveste peste");
        }
    }

    public Boolean getServesteCarneDePui() {
        return servesteCarneDePui;
    }

    public void setServesteCarneDePui(Boolean servesteCarneDePui) {
        this.servesteCarneDePui = servesteCarneDePui;
    }

    public Boolean getServestePeste() {
        return servestePeste;
    }

    public void setServestePeste(Boolean servestePeste) {
        this.servestePeste = servestePeste;
    }

    public Boolean getServesteCarneDeVita() {
        return servesteCarneDeVita;
    }

    public void setServesteCarneDeVita(Boolean servesteCarneDeVita) {
        this.servesteCarneDeVita = servesteCarneDeVita;
    }

    public Boolean getServesteCarneDeCurcan() {
        return servesteCarneDeCurcan;
    }

    public void setServesteCarneDeCurcan(Boolean servesteCarneDeCurcan) {
        this.servesteCarneDeCurcan = servesteCarneDeCurcan;
    }
}
