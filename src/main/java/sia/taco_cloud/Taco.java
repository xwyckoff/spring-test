package sia.taco_cloud;

import lombok.Data;

import java.util.Date;
import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Data
public class Taco {
    
    private long id;
    private Date cratedAt = new Date();

    @NotNull
    @Size(min = 5, message = "Name must be at least five characters long!")
    private String name;

    @NotNull
    @Size(min = 1, message = "Must have at least one ingredient!")
    private List<Ingredient> ingredients;
}
