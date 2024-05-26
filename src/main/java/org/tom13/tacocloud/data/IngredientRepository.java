package org.tom13.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import org.tom13.tacocloud.entity.model.Ingredient;

import java.util.Optional;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);

}
