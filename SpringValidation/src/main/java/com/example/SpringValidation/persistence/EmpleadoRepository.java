package com.example.SpringValidation.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringValidation.entity.Empleado;

@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado, Long> {

}
