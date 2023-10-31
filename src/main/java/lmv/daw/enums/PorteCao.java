package lmv.daw.enums;

public enum PorteCao {
	PEQUENO("pequeno"),
	MEDIO("medio"),
	GRANDE("grande");
	
	private String porte;

	private PorteCao(String porte) {
		this.porte = porte;
	}

	protected String getPorte() {
		return porte;
	}
}
