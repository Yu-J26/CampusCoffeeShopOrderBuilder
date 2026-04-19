package Builder;

import Beverage.Beverage;
import Beverage.Latte;

public class LatteBuilder extends Beverage.Builder<LatteBuilder> {
    public LatteBuilder(String temperature) {
        super("Latte", temperature);
    }

    @Override
    protected LatteBuilder self() {
        return this;
    }

    public LatteBuilder shots(int shots) {
        if (shots < 1 || shots > 3) {
            throw new IllegalArgumentException("Shots must be 1-3");
        }
        this.espressoShots = shots;
        return this;
    }

    @Override
    public Beverage build() {
        return new Latte(this);
    }
}