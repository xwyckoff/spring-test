package sia.taco_cloud;

import lombok.Data;
import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Data
public class Taco {
    
    @NotNull
    @Size(min = 5, message = "Name must be at least five characters long!")
    private String name;

    @NotNull
    @Size(min = 1, message = "Must have at least one ingredient!")
    private List<Ingredient> ingredients;
}
