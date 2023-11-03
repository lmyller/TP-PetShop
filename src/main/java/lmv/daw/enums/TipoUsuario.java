package lmv.daw.enums;

public enum TipoUsuario {
	ADMIN("admin"),
	CLIENTE("cliente");
	
	private String tipoUsuario;

	private TipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}
}
