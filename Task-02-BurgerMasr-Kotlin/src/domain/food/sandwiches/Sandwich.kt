package domain.food.sandwiches

import domain.orders.OrderableItem

abstract class Sandwich(
    title: String,
    price: Double,
    quantity: Int
): OrderableItem(
    title = title, price = price, quantity = quantity
) {
    fun getPrice(): Double {
        return price
    }

}