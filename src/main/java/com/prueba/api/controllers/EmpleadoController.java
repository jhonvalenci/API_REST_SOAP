package com.prueba.api.controllers;

import com.prueba.api.models.EmpleadoDTO;
import com.prueba.api.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

@RestController
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/empleado")
    public ResponseEntity<Object> getEmpleado(
            @RequestParam String nombres,
            @RequestParam String apellidos,
            @RequestParam String tipoDocumento,
            @RequestParam String numeroDocumento,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fechaNacimiento,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fechaVinculacion,
            @RequestParam String cargo,
            @RequestParam Double salario) {

        // Validar los formatos de las fechas y que los atributos no vengan vacíos
        if (StringUtils.isEmpty(nombres)
                || StringUtils.isEmpty(apellidos)
                || StringUtils.isEmpty(tipoDocumento)
                || StringUtils.isEmpty(numeroDocumento)
                || fechaNacimiento == null
                || fechaVinculacion == null
                || StringUtils.isEmpty(cargo)
                || salario == null) {
            return ResponseEntity.badRequest().build();
        }

        // Validar que el empleado sea mayor de edad
        LocalDate fechaNacimientoLocal = fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        if (fechaNacimientoLocal.plusYears(18).isAfter(LocalDate.now())) {
            return ResponseEntity.badRequest().build();
        }

        // Crear el objeto EmpleadoDTO y pasarlo al servicio SOAP
        EmpleadoDTO empleadoDTO = new EmpleadoDTO(nombres, apellidos, tipoDocumento, numeroDocumento, fechaNacimiento, fechaVinculacion, cargo, salario);
        empleadoService.guardarUsuario(empleadoDTO);

        // Calcular el tiempo de vinculación a la compañía y la edad actual del empleado
        LocalDate fechaVinculacionLocal = fechaVinculacion.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Period tiempoVinculacion = Period.between(fechaVinculacionLocal, LocalDate.now());
        Period edadActual = Period.between(fechaNacimientoLocal, LocalDate.now());

        // Crear el objeto de respuesta con la información adicional
        empleadoDTO.setTiempoVinculacion(tiempoVinculacion);
        empleadoDTO.setEdadActual(edadActual);

        return ResponseEntity.ok(empleadoDTO);
    }
}
