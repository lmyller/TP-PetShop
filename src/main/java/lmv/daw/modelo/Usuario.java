package lmv.daw.modelo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Usuario {
	@Id
	String cpf;
	
	@NotBlank(message = "O nome não pode ser vazio!")
	String nome;
	
	@Column(name = "data_nascimento")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	LocalDate dataNascimento;
	
	@Email(message = "E-mail inválido!")
	String email;
	
	@Size(min = 8, max = 20, message = "A senha deve ter entre 8 e 20 caracteres!")
	String senha;
	
	@Size(min = 11, max = 11, message = "O número de telefone")
	String telefone;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
