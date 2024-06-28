package domain.food.extras

import domain.orders.OrderableItem

abstract class Extra(
    title: String,
    price: Double,
    quantity: Int
): OrderableItem(
    title = title, price = price, quantity = quantity
)