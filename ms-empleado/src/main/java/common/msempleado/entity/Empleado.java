package common.msempleado.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLEADO")
public class Empleado implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "p_id")
	@SequenceGenerator(name = "p_id", sequenceName = "PRODUCTOS_SEQ", allocationSize = 1)
	@Column(name = "EMPLEADO_ID", columnDefinition = "NUMBER")
	private int empleadoId;
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(25)")
	private String nombre;
	@Column(name = "CARGO", columnDefinition = "NVARCHAR2(30)")
	private String cargo;
	@Column(name = "SALARIO", columnDefinition = "NUMBER(6,2)")
	private double salario;
	
	public Empleado() {
		
	}

	public Empleado(int empleadoId, String nombre, String cargo, double salario) {
		super();
		this.empleadoId = empleadoId;
		this.nombre = nombre;
		this.cargo = cargo;
		this.salario = salario;
	}

	public int getEmpleadoId() {
		return empleadoId;
	}

	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

		
	

}
