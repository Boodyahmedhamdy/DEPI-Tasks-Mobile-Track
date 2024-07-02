package UI;

import data.KitchenRepository;
import domain.food.extras.Extra;
import domain.food.sandwiches.Sandwich;
import domain.orders.Order;
import domain.orders.OrderableItem;


public class UiController {

    private static final KitchenRepository repository = new KitchenRepository();

    public static void showSandwichesMenu() {
        System.out.println("sandwiches menu\n--------------------");
        for (Sandwich sandwich : repository.getAllSandwiches()) {
            System.out.println(sandwich.id + " - " + sandwich.title);
        }
    }

    public static void showExtrasMenu() {
        System.out.println("extras menu\n----------------");
        for (Extra extra : repository.getAllExtras()) {
            System.out.println(extra.id + " - " + extra.title);
        }
    }

    public static void showReciptOfOrder(Order order) {
        for (OrderableItem item : order.items) {
            System.out.println(item.title + " - " + item.price);
        }
    }


}
