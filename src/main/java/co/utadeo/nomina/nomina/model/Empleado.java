package co.utadeo.nomina.nomina.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(unique = true,nullable = false)
    private String correo;

    @Column(nullable = false)
    private int salario;

    @Column(nullable = false)
    private String cargo;

    Empleado(){
    }

    Empleado(String nombre, String apellido, String correo, int salario, String cargo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.salario=salario;
        this.cargo=cargo;
    }
    
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public String getCorreo(){
        return correo;
    }

    public void setCorreo(String correo){
        this.correo=correo;
    }

    public int getSalario(){
        return salario;
    }

    public void setSalario(int salario){
        this.salario=salario;
    }

    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo=cargo;
    }

}
