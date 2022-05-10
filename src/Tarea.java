package src;

public class Tarea {
	
	private String nombre;
	private Estado estadoDeLaTarea;
	private Usuario creador;
	private Usuario actual;

	public Tarea(String nombre, Estado estadoDeLaTarea, Usuario creador,Usuario actual) {
		this.nombre = nombre;
		this.estadoDeLaTarea = estadoDeLaTarea;
		this.creador = creador;
		this.actual = actual;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estado getEstadoDeLaTarea() {
		return estadoDeLaTarea;
	}

	public void setEstadoDeLaTarea(Estado estadoDeLaTarea) {
		this.estadoDeLaTarea = estadoDeLaTarea;
	}

	public Usuario getCreador() {
		return creador;
	}

	public void setCreador(Usuario creador) {
		this.creador = creador;
	}

	public Usuario getActual() {
		return actual;
	}

	public void setActual(Usuario actual) {
		this.actual = actual;
	}

	@Override
	public String toString() {
		return "Tarea [nombre=" + nombre + ", estadoDeLaTarea=" + estadoDeLaTarea + ", creador=" + creador + ", actual="
				+ actual + "]";
	}
	
}
