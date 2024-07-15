package data;

import domain.food.extras.Extra;
import domain.food.sandwiches.Sandwich;

import java.util.List;

public interface IKitchenRepository {

    List<Sandwich> getAllSandwiches();

    List<Extra> getAllExtras();

    Sandwich getSandwichById(int id);

    Extra getExtraById(int id);
}
