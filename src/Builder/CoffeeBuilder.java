package Builder;

import Beverage.Beverage;

public class CoffeeBuilder extends Beverage.Builder<CoffeeBuilder> {
    public CoffeeBuilder(String temperature) {
        super("Coffee", temperature);
    }

    @Override
    protected CoffeeBuilder self() {
        return this;
    }

    public CoffeeBuilder shots(int shots) {
        if (shots < 1 || shots > 3) {
            throw new IllegalArgumentException("Shots must be 1-3");
        }
        this.espressoShots = shots;
        return this;
    }

    @Override
    public Beverage build() {
        return new Beverage(this);
    }
}
