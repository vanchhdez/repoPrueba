package common.msempleado.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import common.msempleado.entity.Empleado;
import common.msempleado.repository.EmpleadoRepository;
import common.msempleado.request.EmpleadoRequest;
import common.msempleado.service.EmpleadoService;

@Service
public class EmpleadoLogic implements EmpleadoService{
	
	@Autowired
	EmpleadoRepository repo;

	@Override
	public Empleado guardar(EmpleadoRequest request) {
		
		Empleado e = new Empleado();
		
		e.setNombre(request.getNombre());
		e.setCargo(request.getCargo());
		e.setSalario(request.getSalario());
		repo.save(e);
		return e;
	}



	@Override
	public List mostrarTodos() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}



	@Override
	public List mostrarTotal(EmpleadoRequest request) {
		// TODO Auto-generated method stub
		return repo.findAll();
	}



}
