package domain.orders;

public abstract class OrderableItem implements Orderable {
    public String title;
    public double price;
    public int quantity;

    public abstract void onOrder();
}
