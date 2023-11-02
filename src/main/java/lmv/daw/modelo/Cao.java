package lmv.daw.modelo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
	
	@Enumerated(EnumType.STRING)
	private PorteCao porte;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public PorteCao getPorte() {
		return porte;
	}

	public void setPorte(PorteCao porte) {
		this.porte = porte;
	}
}
