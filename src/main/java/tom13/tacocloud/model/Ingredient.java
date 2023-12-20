package tom13.tacocloud.model;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor(access= AccessLevel.PRIVATE, force=true)
@RequiredArgsConstructor
@Table
public class Ingredient {

    @PrimaryKey
    private String id;

    private String name;

    private Type type;

    public enum Type {
        CHEESE, PROTEIN, SAUCE, VEGGIES, WRAP
    }
}
