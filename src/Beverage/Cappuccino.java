package Beverage;

import Customizations.*;

public class Cappuccino extends Beverage {
    private static final double BASE_PRICE = 4.00;
    private static final double PRICE_PER_SHOT = 0.60;

    public Cappuccino(Builder<?> builder) {
        super(builder);
    }

    @Override
    public double getPrice() {
        double price = BASE_PRICE;
        if (Size.MEDIUM.equals(getSize())) price += 0.50;
        else if (Size.LARGE.equals(getSize())) price += 0.75;
        if (Milk.ALMOND.equals(getMilk()) || Milk.OAT.equals(getMilk()) || Milk.SOY.equals(getMilk()))
            price += 0.50;
        price += getEspressoShots() * PRICE_PER_SHOT;
        return price;
    }
}
