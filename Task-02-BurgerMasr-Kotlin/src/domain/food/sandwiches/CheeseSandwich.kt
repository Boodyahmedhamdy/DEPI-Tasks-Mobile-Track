package domain.food.sandwiches

class CheeseSandwich(
    title: String = "CheeseSandwich",
    price: Double = 12.99,
    quantity: Int = 1
): Sandwich(
    title = title, price = price, quantity = quantity
)