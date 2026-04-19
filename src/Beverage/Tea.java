package Beverage;

import Customizations.*;

public class Tea extends Beverage {
    private static final double BASE_PRICE = 2.00;
    private static final double ICED_SURCHARGE = 0.25;

    public Tea(Builder<?> builder) {
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
        return price;
    }
}
