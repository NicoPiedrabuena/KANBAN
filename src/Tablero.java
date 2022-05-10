package src;
import java.util.ArrayList;

public class Tablero {
	private ArrayList <Tarea>tareas;
	private ArrayList <Usuario>usuarios;
	
	
	public Tablero () {
		tareas = new ArrayList<Tarea>();
		usuarios = new ArrayList<Usuario>();
	}
	
	public Boolean agregarTarea (Tarea nueva) {
		return tareas.add(nueva);
	}
	public Boolean agregarUsuario(Usuario nuevo) {
		return usuarios.add(nuevo);
	}
	public ArrayList<Tarea> tareasEnCurso() {
		ArrayList <Tarea>enCurso = new ArrayList <Tarea>();
		for (Tarea tarea : tareas) {
			if(tarea.getEstadoDeLaTarea() == Estado.EN_CURSO) {
				enCurso.add(tarea);
			}
		}
		return enCurso; 
	}
	public ArrayList<Tarea> tareasFinalizadas() {
		ArrayList <Tarea>finalizadas = new ArrayList <Tarea>();
		for (Tarea tarea : tareas) {
			if(tarea.getEstadoDeLaTarea() == Estado.FINALIZADA) {
				finalizadas.add(tarea);
			}
		}
		return finalizadas; 
	}
	public Boolean tomarTarea(Tarea tareaASeleccionar, Usuario usuario) {
		Boolean exito=false;
		Tarea tareaElegida = null;
		for (Tarea tarea : tareas) {
			if(tareaASeleccionar.getEstadoDeLaTarea().equals(Estado.EN_CURSO) && tareaASeleccionar.getCreador().getUsuario().equals(usuario.getUsuario())) {
				exito = true;
				tareaElegida = tarea;
				
			}
			if(tareaASeleccionar.getEstadoDeLaTarea() == Estado.PENDIENTE ) {
				exito = true;
				tareaElegida = tarea;
				
			}
		}
	
		
		
		
		
		return exito;
		
	}
	
	

}
