package service;

import model.Food;

public class ShoppingCart {
    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getTotalWithoutDiscount() {
        double total = 0;
        for (Food food : foods) {
            total += food.getAmount() * food.getPrice();  // Используй геттеры!
        }
        return total;
    }

    public double getTotalWithDiscount() {
        double total = 0;
        for (Food food : foods) {
            double itemTotal = food.getAmount() * food.getPrice();
            double discount = itemTotal * (food.getDiscount() / 100);
            total += itemTotal - discount;
        }
        return total;
    }

    public double getVegetarianTotal() {
        double total = 0;
        for (Food food : foods) {
            if (food.isVegetarian()) {  // Используй геттер!
                total += food.getAmount() * food.getPrice();
            }
        }
        return total;
    }
}
