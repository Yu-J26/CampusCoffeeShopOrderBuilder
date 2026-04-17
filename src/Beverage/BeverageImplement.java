package Beverage;

import Builder.*;

//act as the factory for all types of drinks, and uses the concrete builders
public class BeverageImplement extends BeverageBuilder {

    public CoffeeBuilder createCoffeeBuilder(String temperature){
        return new CoffeeBuilder(temperature);
    }

    public LatteBuilder createLatteBuilder(String temperature) {
        return new LatteBuilder(temperature);
    }

    public CappuccinoBuilder createCappuccinoBuilder(String temperature) {
        return new CappuccinoBuilder(temperature);
    }

    public TeaBuilder createTeaBuilder(String temperature) {
        return new TeaBuilder(temperature);
    }
}