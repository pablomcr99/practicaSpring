package pmancina.ejercicioApi.rest.controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pmancina.ejercicioApi.rest.Servicios.ClienteService;
import pmancina.ejercicioApi.rest.modelos.Cliente;

@RestController
public class ClienteController {
	
	@Autowired ClienteService cs;
	
	@GetMapping("api/client")
	public List<Cliente> getListado(){
		return cs.findAll();
	}
	
	@PostMapping("api/client")
	public Cliente postCliente(@RequestBody  Cliente c) {
		cs.save(c);
		return c;
	}
	
	@GetMapping("api/client/{id}")
	public Optional<Cliente> getById(@PathVariable Long id) {
		return cs.findById(id);
	}
	
	@PutMapping("api/client/{id}")
	public Cliente updateCliente(@PathVariable Long id, @RequestBody Cliente c) {
		Cliente cli= cs.findById(id).get();
		cli.setNombre(c.getNombre());
		cli.setTlf(c.getTlf());
		return cs.save(cli);
		
		
	}
	
	@DeleteMapping("api/client/{id}")
	public void deleteCliente(@PathVariable Long id) {
		cs.delete(cs.findById(id).get());
	}
	
	
	

}
