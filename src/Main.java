import Beverage.*;
import Builder.*;
import Customizations.*;

public class Main {
    public static void main(String[] args) {

        BeverageBuilder builderImp = new BeverageImplement();

        CappuccinoBuilder cappuccinoBuilder = builderImp.createCappuccinoBuilder(Temperature.HOT);
        Beverage cappuccino1 = cappuccinoBuilder
                .size(Size.SMALL)
                .milk(Milk.SKIM)
                .shots(1)
                .sweetener(Sweetener.STEVIA)
                .orderType(OrderType.TAKE_OUT)
                .build();


        CoffeeBuilder coffeeBuilder = builderImp.createCoffeeBuilder(Temperature.HOT);
        Beverage coffee1 = coffeeBuilder
                .size(Size.MEDIUM)
                .milk(Milk.WHOLE)
                .sweetener(Sweetener.SUGAR)
                .orderType(OrderType.DINE_IN)
                .build();


        LatteBuilder latteBuilder = builderImp.createLatteBuilder(Temperature.ICED);
        Beverage latte1 = latteBuilder
                .size(Size.LARGE)
                .milk(Milk.ALMOND)
                .shots(2)
                .sweetener(Sweetener.HONEY)
                .orderType(OrderType.DINE_IN)
                .build();


        TeaBuilder teaBuilder = builderImp.createTeaBuilder(Temperature.ICED);
        Beverage tea1 = teaBuilder
                .size(Size.MEDIUM)
                .milk(Milk.NONE)
                .sweetener(Sweetener.HONEY)
                .orderType(OrderType.TAKE_OUT)
                .build();


        Order order1 = new Order("John ");
        order1.addBeverage(cappuccino1);
        order1.addBeverage(coffee1);

        Order order2 = new Order("Alice ");
        order2.addBeverage(latte1);
        order2.addBeverage(tea1);

        order1.printOrder();
        System.out.println();
        order2.printOrder();
    }
}