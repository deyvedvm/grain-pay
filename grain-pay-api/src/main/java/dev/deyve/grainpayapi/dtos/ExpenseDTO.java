package dev.deyve.grainpayapi.dtos;

import dev.deyve.grainpayapi.models.PaymentType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class ExpenseDTO {

    private Long id;

    @NotBlank(message = "Description cannot be empty")
    private String description;

    @NotNull(message = "Amount cannot be null")
    private BigDecimal amount;

    @NotNull(message = "Date cannot be null")
    private LocalDateTime date;

    @NotNull(message = "Payment type cannot be null")
    private PaymentType paymentType;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
