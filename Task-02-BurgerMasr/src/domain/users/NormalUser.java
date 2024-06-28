package domain.users;

import UI.UiController;
import domain.orders.Order;
import domain.orders.Orderer;

public class NormalUser extends BaseUser implements Orderer {

    @Override
    public void createOrder() {
        UiController.showSandwichesMenu();
    }

    @Override
    public Order createOrderAndReturn() {
        return null;
    }
}
