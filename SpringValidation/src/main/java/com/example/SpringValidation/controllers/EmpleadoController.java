package com.example.SpringValidation.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringValidation.controllers.DTO.EmpleadoDTO;
import com.example.SpringValidation.entity.Empleado;
import com.example.SpringValidation.services.EmpleadoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class EmpleadoController {
    private EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService){
        this.empleadoService = empleadoService;
    }

    // POST PARA GUARDAR
    @PostMapping("/empleado")
    public ResponseEntity<Empleado> saveEmpleado(@RequestBody @Valid EmpleadoDTO empleadoDTO){
        return new ResponseEntity<>(empleadoService.saveEmpleado(empleadoDTO), HttpStatus.CREATED);
    }
}
