package pmancina.ejercicioApi.rest.Servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pmancina.ejercicioApi.rest.modelos.Cliente;
import pmancina.ejercicioApi.rest.repositorios.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository cr;
	
	public List<Cliente> findAll(){
		return cr.findAll();	
	}
	
	public Cliente save(Cliente c) {
		return cr.save(c);
	}
	
	public Optional<Cliente> findById(Long Id) {
		return cr.findById(Id);
	}
	
	public void delete(Cliente c) {
		 cr.delete(c);
	}
	
	public Cliente updateCliente(Cliente c) {
		return cr.save(c);
	}
}
