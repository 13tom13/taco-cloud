package tom13.tacocloud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor(force = true)
@RequiredArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Ingredient {

    @Id
    private String id;

    private String name;

    private Type type;

    public enum Type {
        CHEESE, PROTEIN, SAUCE, VEGGIES, WRAP
    }
}
