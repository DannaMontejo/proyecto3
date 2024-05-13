package co.utadeo.nomina.nomina.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.utadeo.nomina.nomina.model.Empleado;


public interface IEmpleadoRepository extends JpaRepository<Empleado,Long>{

}
