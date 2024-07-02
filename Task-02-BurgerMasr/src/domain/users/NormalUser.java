package domain.users;

import UI.UiController;
import domain.orders.Order;
import domain.orders.Orderer;

public class NormalUser extends BaseUser implements Orderer {

    @Override
    public void createOrder() {
        UiController.showSandwichesMenu();
        // take input from user
        // parse the input to see if it is right
        // if it was wrong i need to show error message to user and retake his order
        UiController.showExtrasMenu();
        // take input from user
        // parse input from user
        // if the input was wrong i need to show him a error message
        UiController.showReciptOfOrder(
                new Order()
        );
    }

    @Override
    public Order createOrderAndReturn() {
        return null;
    }
}
