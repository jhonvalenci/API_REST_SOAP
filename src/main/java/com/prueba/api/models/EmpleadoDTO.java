package com.prueba.api.models;

import java.time.Period;
import java.util.Date;

public class EmpleadoDTO {
    private String nombres;
    private String apellidos;
    private String tipoDocumento;
    private String numeroDocumento;
    private Date fechaNacimiento;
    private Date fechaVinculacion;
    private String cargo;
    private Double salario;
    private Period tiempoVinc;

    public EmpleadoDTO(String nombres, String apellidos, String tipoDocumento, String numeroDocumento, Date fechaNacimiento, Date fechaVinculacion, String cargo, Double salario) {
    }

    public static Products save(EmpleadoDTO products) {
        return null;
    }

    public void setTiempoVinculacion(Period tiempoVinculacion) {
    }

    public void setEdadActual(Period edadActual) {
    }
}
