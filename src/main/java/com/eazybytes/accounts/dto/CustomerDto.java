package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description="Schema to hold Customer and Account information"
)

public class CustomerDto {

    @Schema(
        description = "Name of the customer", example="Eazy Bytes"
    )
    @NotEmpty(message = "Name not empty")
    @Size(min=5, max=30, message = "The length of the customer name should be between 5 and 30")
    private String name;
    @NotEmpty(message = "not empty of email")
    @Email
    private String email;

    @Schema(
        description = "Mobile Number of the customer", example = "934534352"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Account details of the Customer"
    )
    private AccountsDto accountsDto;
}
