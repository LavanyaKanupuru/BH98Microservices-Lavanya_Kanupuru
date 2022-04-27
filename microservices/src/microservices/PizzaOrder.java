package microservices;

import java.util.ArrayList;

public class PizzaOrder {
    private double totalOrderCost;

    private final ArrayList<Pizza> pizzas;

    public PizzaOrder(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public void calculateTotalOrderCost() {
        final double LARGE_COST = 9.99;
        final double MEDIUM_COST = 7.99;
        final double SMALL_COST = 5.99;
        final double COST_PER_TOPPING = 0.5;

        for (Pizza pizza : pizzas) {
            switch (pizza.getSize()) {
                case "Large":
                    totalOrderCost += LARGE_COST;
                    break;
                case "Medium":
                    totalOrderCost += MEDIUM_COST;
                    break;
                case "Small":
                    totalOrderCost += SMALL_COST;
                    break;
                default:
                    totalOrderCost += 0.0;
                    break;
            }

            int totalToppings = pizza.getToppings().size();
            totalOrderCost += totalToppings * COST_PER_TOPPING;
        }
    }

    public double getTotalOrderCost() {
        return totalOrderCost;
    }

    public void printOrderSummary() {
        for (Pizza pizza : pizzas) {
            System.out.println("Ordered a " + pizza.getSize() + " pizza with " +    pizza.getToppings());
        }
        System.out.println("TOTAL ORDER AMOUNT: " + getTotalOrderCost());
        
    }
}