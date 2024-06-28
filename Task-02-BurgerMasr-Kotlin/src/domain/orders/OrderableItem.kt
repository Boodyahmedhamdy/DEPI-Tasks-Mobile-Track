package domain.orders

abstract class OrderableItem(
    val title: String = "DefaultName",
    val price: Double = 0.0,
    val quantity: Int = 1
): Orderable