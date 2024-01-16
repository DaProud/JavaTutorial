package VariabilaMetoda;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Car {

    public String brand;
    public String model;
    public Integer price;
    public String color;

    @Test
    public void presentCar() {
        brand = "BMW";
        model = "Seria 5";
        price = 15_000;
        color = "Space Grey";

        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("Color: " + color);

        computePriceInRON(price);
    }

    private void computePriceInRON(Integer priceInEuro) {
        Double exchangeRateEuroToRon = 4.89;
        Double priceInRON = priceInEuro * exchangeRateEuroToRon;

        System.out.println("Price in RON: " + priceInRON);

        if (priceInRON > 70_000) {
            Assert.fail("Price too high today! :D (" + priceInRON + ")");
        }
    }

}
