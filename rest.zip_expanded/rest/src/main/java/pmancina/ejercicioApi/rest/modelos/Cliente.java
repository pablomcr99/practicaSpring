package pmancina.ejercicioApi.rest.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Cliente {
	
	private String nombre;
	
	private String tlf;
	
    @Id @GeneratedValue 
    private Long id;

}
