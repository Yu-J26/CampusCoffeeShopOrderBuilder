package Beverage;

import Builder.CoffeeBuilder;
import Builder.LatteBuilder;
import Builder.CappuccinoBuilder;
import Builder.TeaBuilder;

public abstract class BeverageBuilder {
    abstract CoffeeBuilder createCoffeeBuilder();
    abstract LatteBuilder createLatteBuilder();
    abstract CappuccinoBuilder createCappuccinoBuilder();
    abstract TeaBuilder createTeaBuilder();
}
