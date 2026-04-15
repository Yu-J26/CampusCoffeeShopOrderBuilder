package Beverage;

import Customizations.*;

public class Beverage {
    private final String type;
    private final String temperature;
    private final String size;
    private final String milk;
    private final int espressoShots;
    private final String sweetener;
    private final String orderType;

    public Beverage(Builder<?> builder) {
        this.type = builder.type;
        this.temperature = builder.temperature;
        this.size = builder.size;
        this.milk = builder.milk;
        this.espressoShots = builder.espressoShots;
        this.sweetener = builder.sweetener;
        this.orderType = builder.orderType;
    }

    public String getType() { return type; }
    public String getTemperature() { return temperature; }
    public String getSize() { return size; }
    public String getMilk() { return milk; }
    public int getEspressoShots() { return espressoShots; }
    public String getSweetener() { return sweetener; }
    public String getOrderType() { return orderType; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(size).append(" ").append(temperature).append(" ").append(type);
        if (!milk.equals(Milk.NONE)) sb.append(" with ").append(milk).append(" milk");
        if (espressoShots > 0) sb.append(", ").append(espressoShots).append(" shot(s)");
        if (!sweetener.equals(Sweetener.NONE)) sb.append(", sweetened with ").append(sweetener);
        sb.append(" (").append(orderType).append(")");
        return sb.toString();
    }

    public static abstract class Builder<T extends Builder<T>> {
        protected final String type;
        protected final String temperature;
        protected String size = Size.MEDIUM;
        protected String milk = Milk.NONE;
        protected int espressoShots = 0;
        protected String sweetener = Sweetener.NONE;
        protected String orderType = OrderType.DINE_IN;

        public Builder(String type, String temperature) {
            this.type = type;
            this.temperature = temperature;
        }

        protected abstract T self();

        public T size(String size) {
            this.size = size;
            return self();
        }

        public T milk(String milk) {
            this.milk = milk;
            return self();
        }

        public T sweetener(String sweetener) {
            this.sweetener = sweetener;
            return self();
        }

        public T orderType(String orderType) {
            this.orderType = orderType;
            return self();
        }

        public abstract Beverage build();
    }
}