package Builder;

import Beverage.Beverage;
import Beverage.Coffee;

public class CoffeeBuilder extends Beverage.Builder<CoffeeBuilder> {
    public CoffeeBuilder(String temperature) {
        super("Coffee", temperature);
    }

    @Override
    protected CoffeeBuilder self() {
        return this;
    }

    @Override
    public Beverage build() {
        return new Coffee(this);
    }
}
