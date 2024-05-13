package co.utadeo.nomina.nomina.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.utadeo.nomina.nomina.model.Empleado;
import co.utadeo.nomina.nomina.service.IEmpleadoService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("empleados")
public class EmpleadoController {

    private IEmpleadoService empleadoService;

    EmpleadoController(IEmpleadoService empleadoService){
        this.empleadoService=empleadoService;
    }

    @PostMapping("/crear")
    public Empleado store(@RequestBody Empleado empleado) {
        return this.empleadoService.createEmpleado(empleado);
    }

    @GetMapping("/{id}")
    public Empleado show(@PathVariable("id") Long id){
        return this.empleadoService.getById(id);
    }
    
    @GetMapping("/all")
    public List<Empleado> showAll(){
        return this.empleadoService.getAllEmpleados();
    }

    @PutMapping("/actualizar/{id}")
    public Empleado update(@PathVariable("id") Long id, @RequestBody Empleado empleado) {
        return this.empleadoService.updateEmpleado(id,empleado);
    }

    

}
