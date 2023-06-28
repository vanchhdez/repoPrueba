package common.msempleado.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import common.msempleado.entity.Empleado;
import common.msempleado.logic.EmpleadoLogic;
import common.msempleado.request.EmpleadoRequest;


@RestController
@RequestMapping("empleado/")
public class EmpleadoController {
	
	@Autowired
	EmpleadoLogic service;
	
	@GetMapping("mostrar")
	public ResponseEntity<List<Empleado>> mostrar(){
		List<Empleado> empleado = service.mostrarTodos();
		return new ResponseEntity<List<Empleado>>(empleado, HttpStatus.OK);
	}
	
	@PostMapping("guardar")
	public ResponseEntity<Empleado> guardar(@RequestBody EmpleadoRequest req){
		Empleado e = service.guardar(req);
		return new ResponseEntity<Empleado>(e, HttpStatus.OK);
	}
	
	@PostMapping("mostrar-total")
    public double mostrarTotal(@RequestBody EmpleadoRequest req) {
        double totalSalario = 0;
        List<Empleado> empleados = req.getEmpleados();
        for (Empleado empleado : empleados) {
            totalSalario += empleado.getSalario();
        }
        return totalSalario;
    }

}
