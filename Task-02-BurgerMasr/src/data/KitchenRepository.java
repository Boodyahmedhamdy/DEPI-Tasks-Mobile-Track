package data;

import domain.food.extras.KatchupExtra;
import domain.food.extras.SodaExtra;
import domain.food.sandwiches.BurgerSandwich;
import domain.food.sandwiches.CheeseSandwich;
import domain.food.extras.Extra;
import domain.food.sandwiches.Sandwich;

import java.util.List;

public class KitchenRepository implements IKitchenRepository {

    @Override
    public List<Sandwich> getAllSandwiches() {
        return List.of(
                new CheeseSandwich(),
                new BurgerSandwich()
        );
    }

    @Override
    public List<Extra> getAllExtras() {
        return List.of(
                new SodaExtra(),
                new KatchupExtra()
        );
    }

    @Override
    public Sandwich getSandwichById(int id) {
        for (Sandwich sandwich : getAllSandwiches()) {
            if(sandwich.id == id) {
                return sandwich;
            }
        }
        return null;
    }

    @Override
    public Extra getExtraById(int id) {
        for (Extra extra : getAllExtras()) {
            if(extra.id == id) {
                return extra;
            }
        }
        return null;
    }
}
