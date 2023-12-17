package tom13.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import tom13.tacocloud.model.Ingredient;

import java.util.List;
import java.util.Optional;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

    List<Ingredient> findAll();
    Optional<Ingredient> findById(String id);
    Ingredient save(Ingredient ingredient);
}
