package sia.taco_cloud;

import java.util.List;

import org.hibernate.validator.constraints.CreditCardNumber;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import lombok.Data;

@Data
public class TacoOrder implements Serializable {

    private static final long serialVersionUID = 1L;
    private long id;
    private Date placedAt;

    @NotBlank(message = "Delivery name cannot be blank!")
    private String deliveryName;
    
    @NotBlank(message = "Delivery street cannot be blank!")
    private String deliveryStreet;
    
    @NotBlank(message = "Delivery city cannot be blank!")
    private String deliveryCity;
    
    @NotBlank(message = "Delivery state cannot be blank!")
    private String deliveryState;
    
    @NotBlank(message = "Delivery zip cannot be blank!")
    private String deliveryZip;
    
    @CreditCardNumber(message = "Not a valid credit card number!")
    private String ccNumber;
    
    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([2-9][0-9])$", message="Must be formatted MM/YY")
    private String ccExpiration;
    
    @Digits(integer=3, fraction=0, message="Invalid CVV")
    private String ccCVV;
    
    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        tacos.add(taco);
    }
}
