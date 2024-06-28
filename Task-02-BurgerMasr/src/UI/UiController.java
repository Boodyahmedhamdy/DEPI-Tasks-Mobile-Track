package UI;

import data.KitchenRepository;

public class UiController {

    private static final KitchenRepository repository = new KitchenRepository();

    public static void showSandwichesMenu() {
        System.out.println("sandwiches menu");
//        List<OrderableItem> sandwichList = repository.sandwiches;
    }

    public static void showExtrasMenu() {
        System.out.println("extras menu");
    }

}
