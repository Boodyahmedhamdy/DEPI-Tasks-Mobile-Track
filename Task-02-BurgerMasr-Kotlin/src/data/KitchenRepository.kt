package data

import domain.food.sandwiches.BurgerSandwich
import domain.food.sandwiches.CheeseSandwich
import domain.food.sandwiches.Sandwich
import domain.orders.Orderable

class KitchenRepository {

    val sandwiches: List<Sandwich> = listOf(
        BurgerSandwich(),
        CheeseSandwich()
    )
}