package tom13.tacocloud.model.udt;


import lombok.*;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;
import tom13.tacocloud.model.Ingredient;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@UserDefinedType("ingredient")
public class IngredientUDT {
    private final String name;
    private final Ingredient.Type type;
}
