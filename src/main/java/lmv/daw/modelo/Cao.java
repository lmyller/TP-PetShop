package lmv.daw.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.validator.constraints.NotBlank;

import lmv.daw.enums.PorteCao;

@Entity
public class Cao {
	@Id
	@SequenceGenerator(name = "cao_id", sequenceName = "cao_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cao_id")
	private Long id;
	
	@NotBlank(message = "O nome não pode ser vazio!")
	private String nome;
	
	@NotBlank(message = "O raça não pode ser vazio!")
	private String raca;
	
	
	private PorteCao porte;
}
