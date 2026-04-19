package Builder;

import Beverage.Beverage;
import Beverage.Cappuccino;

public class CappuccinoBuilder extends Beverage.Builder<CappuccinoBuilder> {
    public CappuccinoBuilder(String temperature) {
        super("Cappuccino", temperature);
    }

    @Override
    protected CappuccinoBuilder self() {
        return this;
    }

    public CappuccinoBuilder shots(int shots) {
        if (shots < 1 || shots > 3) {
            throw new IllegalArgumentException("Shots must be 1-3");
        }
        this.espressoShots = shots;
        return this;
    }

    @Override
    public Beverage build() {
        return new Cappuccino(this);
    }
}