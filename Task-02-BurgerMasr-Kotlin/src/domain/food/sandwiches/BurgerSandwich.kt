package domain.food.sandwiches

class BurgerSandwich(
    title: String = "BurgerSandwich",
    price: Double = 20.0,
    quantity: Int = 1
): Sandwich(
    title = title, price = price, quantity = quantity
)
