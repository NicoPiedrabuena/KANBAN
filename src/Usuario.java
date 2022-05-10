package src;

public class Usuario {
	
	private String usuario;

	public Usuario (String usuario) {
		this.usuario = usuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Usuario [usuario=" + usuario + "]";
	}
	
	
}
