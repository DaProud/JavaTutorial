package OOP.Abstractizare.Restaurant;

import org.testng.annotations.Test;

public class RestaurantTest {

    @Test
    public void metodaTest() {
        RestaurantVegan restaurantVegan1 = new RestaurantVegan("La Baciu", 156, "Vegan", true, true, "Costica");
        restaurantVegan1.servesteMancareVeganaInRestaurant();
        restaurantVegan1.livreazaMancareVegana();

        RestaurantCarne restaurantCarne1 = new RestaurantCarne("Chicago Blues", 79, "Carne", true, true, false, true);
        restaurantCarne1.servesteCarneDePui();
        restaurantCarne1.servesteCarneDeCurcan();
        restaurantCarne1.servesteCarneDeVita();
        restaurantCarne1.servestePeste();

        RestaurantCarne oldCity = new RestaurantCarne("Old City", 96, "Carne");
        oldCity.setServestePeste(true);
        oldCity.setServesteCarneDePui(true);
        oldCity.setServesteCarneDeCurcan(true);
        oldCity.setServesteCarneDeVita(true);

        oldCity.servestePeste();
        oldCity.servesteCarneDePui();
        oldCity.servesteCarneDeCurcan();
        oldCity.servesteCarneDeVita();
        oldCity.livreazaLaDomiciliu();

        RestaurantCarne laPacala = new RestaurantCarne("La Pacala", 23, "Carne");
        laPacala.setServestePeste(false);
        laPacala.setServesteCarneDePui(false);
        laPacala.setServesteCarneDeCurcan(false);
        laPacala.setServesteCarneDeVita(false);

        laPacala.servestePeste();
        laPacala.servesteCarneDePui();
        laPacala.servesteCarneDeCurcan();
        laPacala.servesteCarneDeVita();
        laPacala.livreazaLaDomiciliu();


    }

}
