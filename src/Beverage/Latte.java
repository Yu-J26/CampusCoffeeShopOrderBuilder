package Beverage;

import Customizations.*;

public class Latte extends Beverage {
    private static final double BASE_PRICE = 3.50;
    private static final double ICED_SURCHARGE = 0.25;
    private static final double PRICE_PER_SHOT = 0.60;

    public Latte(Builder<?> builder) {
        super(builder);
    }

    @Override
    public double getPrice() {
        double price = BASE_PRICE;
        if (Temperature.ICED.equals(getTemperature())) price += ICED_SURCHARGE;
        if (Size.MEDIUM.equals(getSize())) price += 0.50;
        else if (Size.LARGE.equals(getSize())) price += 0.75;
        if (Milk.ALMOND.equals(getMilk()) || Milk.OAT.equals(getMilk()) || Milk.SOY.equals(getMilk()))
            price += 0.50;
        price += getEspressoShots() * PRICE_PER_SHOT;
        return price;
    }
}
