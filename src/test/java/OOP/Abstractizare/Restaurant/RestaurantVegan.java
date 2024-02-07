package OOP.Abstractizare.Restaurant;

public class RestaurantVegan extends Restaurant implements RestaurantVeganInt {
    private Boolean areMeniuVegetarian;
    private Boolean areMeniuRawVegan;
    private String numeBucatarSef;

    public RestaurantVegan(String numeRestaurant, Integer numarMaximLocuri, String tipRestaurant,
                           Boolean areMeniuVegetarian, Boolean areMeniuRawVegan, String numeBucatarSef) {
        super(numeRestaurant, numarMaximLocuri, tipRestaurant);
        this.areMeniuVegetarian = areMeniuVegetarian;
        this.areMeniuRawVegan = areMeniuRawVegan;
        this.numeBucatarSef = numeBucatarSef;
    }

    @Override
    public void livreazaMancareVegana() {
        System.out.println("Restaurantul " + getNumeRestaurant() + " livreaza mancare vegana");
    }

    @Override
    public void servesteMancareVeganaInRestaurant() {
        System.out.println("Restaurantul " + getNumeRestaurant() + " serveste mancare vegana la locatie in restaurant");
    }

    public Boolean getAreMeniuVegetarian() {
        return areMeniuVegetarian;
    }

    public void setAreMeniuVegetarian(Boolean areMeniuVegetarian) {
        this.areMeniuVegetarian = areMeniuVegetarian;
    }

    public Boolean getAreMeniuRawVegan() {
        return areMeniuRawVegan;
    }

    public void setAreMeniuRawVegan(Boolean areMeniuRawVegan) {
        this.areMeniuRawVegan = areMeniuRawVegan;
    }

    public String getNumeBucatarSef() {
        return numeBucatarSef;
    }

    public void setNumeBucatarSef(String numeBucatarSef) {
        this.numeBucatarSef = numeBucatarSef;
    }

}
