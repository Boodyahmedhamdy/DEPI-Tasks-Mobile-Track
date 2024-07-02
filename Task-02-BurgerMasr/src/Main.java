import UI.InputParser;
import UI.UiController;
import data.KitchenRepository;
import domain.food.extras.Extra;
import domain.food.sandwiches.Sandwich;
import domain.orders.Order;
import domain.orders.OrderableItem;

import java.util.List;
import java.util.Scanner;

import static UI.InputParser.parseSandwichesInput;

public class Main {

    public static final KitchenRepository repository = new KitchenRepository();

    public static void main(String[] args) {
        System.out.println("BurgerMasr");
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();
        System.out.println("Choose your favorate Sandwich:");
        UiController.showSandwichesMenu();
        String  sandwichesInput = scanner.nextLine();
        List<Integer> sandwichesIds =  InputParser.parseSandwichesInput(sandwichesInput);
        for (Integer sandwichId : sandwichesIds) {
            Sandwich sandwich = repository.getSandwichById(sandwichId);
            order.items.add(sandwich);
        }

        System.out.println("Do you want extras?? 'true' if you want");
        boolean withExtras = scanner.nextBoolean();

        if(withExtras) {
            UiController.showExtrasMenu();
            String extras = scanner.nextLine();
            List<Integer> extrasIds = InputParser.parseExtrasInput(extras);
            for (Integer extraId : extrasIds) {
                Extra extra = repository.getExtraById(extraId);
                order.items.add(extra);
            }
        }

        System.out.println("your Final Order is");
        for (OrderableItem item : order.items) {
            System.out.println(item.title);
        }
        System.out.println("confirm your order? 0 -> no, 1 -> yes? 0/1");
        boolean orderConfirmed = scanner.nextBoolean();
    }

    private static List<Integer> parseExtraIds(String extras) {
        return null;
    }

}
