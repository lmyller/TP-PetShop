package lmv.daw.modelo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

import lmv.daw.enums.TipoUsuario;

@Entity
public class Login {	
	@Id
	private String login;
	
	@NotBlank
	private String senha;
	
	@Enumerated(EnumType.STRING)
	private TipoUsuario tipoUsuario;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
}
