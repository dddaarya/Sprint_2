import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // Создаём продукты
        Meat meat = new Meat(5, 100);
        Apple redApples = new Apple(10, 50, Colour.RED);
        Apple greenApples = new Apple(8, 60, Colour.GREEN);

        // Создаём массив продуктов
        Food[] foods = {meat, redApples, greenApples};

        // Создаём корзину
        ShoppingCart cart = new ShoppingCart(foods);

        // Выводим результаты
        System.out.println("Общая сумма без скидки: " + cart.getTotalWithoutDiscount());
        System.out.println("Общая сумма со скидкой: " + cart.getTotalWithDiscount());
        System.out.println("Сумма вегетарианских продуктов: " + cart.getVegetarianTotal());
    }
}
