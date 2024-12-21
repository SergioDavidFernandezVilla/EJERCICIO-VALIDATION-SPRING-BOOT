package com.example.SpringValidation.services;

import org.springframework.stereotype.Service;

import com.example.SpringValidation.controllers.DTO.EmpleadoDTO;
import com.example.SpringValidation.entity.Deparment;
import com.example.SpringValidation.entity.Empleado;
import com.example.SpringValidation.persistence.EmpleadoRepository;

@Service
public class EmpleadoService {
    private EmpleadoRepository empleadoRepository;

    // Constructor para inyectar la dependencia
    public EmpleadoService(EmpleadoRepository empleadoRepository){
        this.empleadoRepository = empleadoRepository;
    }

    public Empleado saveEmpleado(EmpleadoDTO empleadoDTO){
        Empleado empleado = Empleado.builder()
            .name(empleadoDTO.getName())
            .lastName(empleadoDTO.getLastName())
            .age(empleadoDTO.getAge())
            .email(empleadoDTO.getEmail())
            .password(empleadoDTO.getPassword())
            .phone(empleadoDTO.getPhone())
            .address(empleadoDTO.getAddress())
            .birthday(empleadoDTO.getBirthday())
                .departamento(Deparment.builder()
                    .name(empleadoDTO.getDeparmentDTO().getName())
                    .city(empleadoDTO.getDeparmentDTO().getCity())

                .build()
            )
        
        .build();
        return this.empleadoRepository.save(empleado);
    }
}
