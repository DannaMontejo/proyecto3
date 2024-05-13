package co.utadeo.nomina.nomina.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.utadeo.nomina.nomina.model.Empleado;
import co.utadeo.nomina.nomina.repository.IEmpleadoRepository;

@Service
public class EmpleadoServiceImplementation implements IEmpleadoService{

    private IEmpleadoRepository empleadoRepository;

    EmpleadoServiceImplementation(IEmpleadoRepository empleadoRepository){
        this.empleadoRepository=empleadoRepository;
    }

    @Override
    public Empleado createEmpleado(Empleado empleado){
        return this.empleadoRepository.save(empleado);
    }

    @Override
    public Empleado updateEmpleado(Long id, Empleado empleado){
        if(this.empleadoRepository.existsById(id)){
            empleado.setId(id);
            return this.empleadoRepository.save(empleado);
        }

        return null;
    }

    @Override
    public Empleado getById(Long id){
        return this.empleadoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Empleado> getAllEmpleados(){
        return this.empleadoRepository.findAll();
    }

    @Override
    public void deleteEmpleado(Long id){
        this.empleadoRepository.deleteById(id);

    }
}
