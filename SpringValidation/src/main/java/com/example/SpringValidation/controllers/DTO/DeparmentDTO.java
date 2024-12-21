package com.example.SpringValidation.controllers.DTO;

import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Validated
@AllArgsConstructor
@NoArgsConstructor
public class DeparmentDTO {
    private Long id;
    private String name;
    private String city;
}
