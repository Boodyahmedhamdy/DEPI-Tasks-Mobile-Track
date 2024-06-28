package domain.orders;

public interface Orderer {
    void createOrder();
    Order createOrderAndReturn();
}
