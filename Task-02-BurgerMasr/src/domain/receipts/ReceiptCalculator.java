package domain.receipts;

import domain.orders.Order;
import domain.orders.OrderableItem;

public class ReceiptCalculator {

    static double calculateOrderPrice(Order order) {
        double totalPrice = 0;
        for (OrderableItem item : order.items) {
            totalPrice += item.price;
        }
        return totalPrice;
    }
}
