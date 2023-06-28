package common.msempleado.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import common.msempleado.entity.Empleado;
import common.msempleado.request.EmpleadoRequest;



@Service
public interface EmpleadoService {
	
	Empleado guardar(EmpleadoRequest request);
	List mostrarTotal(EmpleadoRequest request);
	List mostrarTodos();

}
