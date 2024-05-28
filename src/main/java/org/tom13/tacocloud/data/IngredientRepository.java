package org.tom13.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import org.tom13.tacocloud.entity.model.Ingredient;

public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {
}
