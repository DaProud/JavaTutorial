package OOP.Abstractizare.Restaurant;

public class Restaurant {
    private String numeRestaurant;
    private Integer numarMaximLocuri;
    private String tipRestaurant;

    public Restaurant(String numeRestaurant, Integer numarMaximLocuri, String tipRestaurant) {
        this.numeRestaurant = numeRestaurant;
        this.numarMaximLocuri = numarMaximLocuri;
        this.tipRestaurant = tipRestaurant;
    }

    public String getNumeRestaurant() {
        return numeRestaurant;
    }

    public void setNumeRestaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
    }

    public Integer getNumarMaximLocuri() {
        return numarMaximLocuri;
    }

    public void setNumarMaximLocuri(Integer numarMaximLocuri) {
        this.numarMaximLocuri = numarMaximLocuri;
    }

    public String getTipRestaurant() {
        return tipRestaurant;
    }

    public void setTipRestaurant(String tipRestaurant) {
        this.tipRestaurant = tipRestaurant;
    }
}
