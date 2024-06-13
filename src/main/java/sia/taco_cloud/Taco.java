package sia.taco_cloud;

import lombok.Data;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Data
@Table
public class Taco {
    
    @Id
    private Long id;

    @CreatedDate
    private Date createdAt = new Date();

    @NotNull
    @Size(min = 5, message = "Name must be at least five characters long!")
    private String name;

    @NotNull
    @Size(min = 1, message = "Must have at least one ingredient!")
    private List<Ingredient> ingredients;
}
