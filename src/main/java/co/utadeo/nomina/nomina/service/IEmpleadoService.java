package co.utadeo.nomina.nomina.service;

import co.utadeo.nomina.nomina.model.Empleado;

import java.util.List;

public interface IEmpleadoService {
    Empleado createEmpleado(Empleado emeplado);
    Empleado updateEmpleado(Long id,Empleado empleado);
    Empleado getById(Long id);
    List<Empleado> getAllEmpleados();
    void deleteEmpleado(Long id);
}
