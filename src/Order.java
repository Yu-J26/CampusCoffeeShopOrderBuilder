import Beverage.Beverage;

import java.util.ArrayList;

public class Order {
    private String name;
    private ArrayList<Beverage> beveragesOrder;


    public Order(String name){
        this.name = name;
        beveragesOrder = new ArrayList<Beverage>();
    }

    public void addBeverage(Beverage beverage){
        beveragesOrder.add(beverage);
    }

    public void printOrder(){
        System.out.println("Order name: " + name);
        System.out.println("Drinks: ");

        for (Beverage beverage : beveragesOrder){
            System.out.println("     " + beverage.toString());
        }
    }
}
