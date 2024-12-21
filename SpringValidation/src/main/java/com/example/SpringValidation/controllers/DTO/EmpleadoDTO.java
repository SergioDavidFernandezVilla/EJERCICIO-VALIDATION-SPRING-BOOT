package com.example.SpringValidation.controllers.DTO;

import java.time.LocalDate;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpleadoDTO {

    @NonNull
    @NotBlank(message = "El nombre no puede estar vacío")
    private String name;
    
    @NonNull
    @NotBlank(message = "El apellido no puede estar vacío")
    private String lastName;

    @Max(value = 100, message = "La edad no puede ser mayor a 100")
    private Integer age;

    @Email(message = "El email no es válido")
    @NonNull
    private String email;

    @NotBlank
    @NonNull
    @Size(min = 8, message = "La contraseña debe tener al menos 8 caracteres")
    private String password;

    @NotBlank
    @NonNull
    @Size(min = 8, message = "El teléfono debe tener al menos 16 caracteres")
    private String phone;

    @NotBlank
    @NonNull
    @Size(min = 10, message = "La dirección debe tener al menos 10 caracteres")
    private String address;

    private LocalDate birthday;

    @Valid
    private DeparmentDTO deparmentDTO;
}
