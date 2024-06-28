package domain.food.extras

class SodaExtra(
    title: String = "SodaExtra",
    price: Double = 3.0,
    quantity: Int = 1
): Extra(
    title = title, price = price, quantity = quantity
) {
}