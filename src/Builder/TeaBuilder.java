package Builder;

import Beverage.Beverage;

public class TeaBuilder extends Beverage.Builder<TeaBuilder> {
    public TeaBuilder(String temperature) {
        super("Tea", temperature);
    }

    @Override
    protected TeaBuilder self() {
        return this;
    }

    @Override
    public Beverage build() {
        return new Beverage(this);
    }
}
