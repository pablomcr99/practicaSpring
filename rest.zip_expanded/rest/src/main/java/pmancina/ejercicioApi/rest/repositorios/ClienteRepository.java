package pmancina.ejercicioApi.rest.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import pmancina.ejercicioApi.rest.modelos.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long>{

}
