package common.msempleado.request;

import java.util.List;

import common.msempleado.entity.Empleado;

public class EmpleadoRequest {
	
	private int empleadoId;
	private String nombre;
	private String cargo;
	private double salario;
	private List<Empleado> empleados;
	
	public EmpleadoRequest() {
		
	}

	public EmpleadoRequest(int empleadoId, String nombre, String cargo, double salario, List<Empleado> empleados) {
		super();
		this.empleadoId = empleadoId;
		this.nombre = nombre;
		this.cargo = cargo;
		this.salario = salario;
		this.empleados = empleados;
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

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	

}
