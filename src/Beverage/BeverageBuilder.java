package Beverage;

import Builder.CoffeeBuilder;
import Builder.LatteBuilder;
import Builder.CappuccinoBuilder;
import Builder.TeaBuilder;

public abstract class BeverageBuilder {
    public abstract CoffeeBuilder createCoffeeBuilder(String temperature);
    public abstract LatteBuilder createLatteBuilder(String temperature);
    public abstract CappuccinoBuilder createCappuccinoBuilder(String temperature);
    public abstract TeaBuilder createTeaBuilder(String temperature);
}
