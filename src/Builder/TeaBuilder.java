package Builder;

import Beverage.Beverage;
import Beverage.Tea;

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
        return new Tea(this);
    }
}
