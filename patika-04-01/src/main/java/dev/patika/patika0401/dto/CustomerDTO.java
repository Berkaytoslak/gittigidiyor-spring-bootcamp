package dev.patika.patika0401.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO  {
    @ApiModelProperty(hidden = true)
    private long id;

    @ApiModelProperty(example = "Koray")
    @NotBlank(message = "First Name is mandatory")
    private String firstName;

    @ApiModelProperty(example = "Güney")
    @NotBlank(message = "Last Name is mandatory")
    private String lastName;

    @ApiModelProperty(example = "11111111111")
    @NotNull(message = "SSID is mandatory")
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private long ssid;

    @ApiModelProperty(example = "patika@dev.com")
    @Email(message = "Email format is wrong")
    @NotBlank(message = "Email is mandatory")
    private String email;

}
