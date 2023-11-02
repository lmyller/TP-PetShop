package lmv.daw.modelo;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class ServicoAgendado {
	@OneToOne
	private Cao cao;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate data;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Servico> servicos;
	
	public Cao getCao() {
		return cao;
	}
	public void setCao(Cao cao) {
		this.cao = cao;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public List<Servico> getServicos() {
		return servicos;
	}
	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}
}
