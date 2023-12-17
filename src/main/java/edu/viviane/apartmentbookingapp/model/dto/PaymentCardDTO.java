package edu.viviane.apartmentbookingapp.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentCardDTO {

    @NotBlank(message = "Cardholder name cannot be empty")
    @Pattern(regexp = "^[a-zA-Z\\s]*$", message = "Cardholder name must contain only letters and spaces")
    @Size(min = 3, max = 50, message = "Cardholder name should be between 3 and 50 characters")
    private String cardholderName;

    // 16 digits + Luhn check
    @NotBlank(message = "Phone number cannot be empty")
    private String cardNumber;

//    @CardExpiry
//    private String expirationDate;
//
//    @Pattern(regexp = "^\\d{3}$", message = "CVC must be 3 digits")
//    private String cvc;
}
