package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Alumno;

public class ListadoAlumnos {
public static List<Alumno> alumnos = new ArrayList<>();
	
	public static List<Alumno> listarAlumnos(){
		return alumnos;
	}
	
	public static Alumno buscarAlumnoPorLu(String lu) {
		for (Alumno alumno : alumnos) {
			if(alumno.getLu().equals(lu)) {
				return alumno;
			}
		}
		return null;
	}
	
	public static void agregarAlumno(Alumno alumno) {
		/*boolean existe = false;
		for(Alumno a : alumnos) {
			if(a.getLu().equals(alumno.getLu())) {
				existe = true;
				break;
			}
		}
		if(!existe)alumnos.add(alumno);*/
		alumnos.add(alumno);
	}
	
	public static void modificarAlumno(Alumno alumnoModificado) {
		for (int i = 0; i < alumnos.size(); i++) {
			Alumno alumno = alumnos.get(i);
			if(alumno.getLu().equals(alumnoModificado.getLu())) {
				alumnos.set(i, alumnoModificado);
				break;
			}
		}
	}
	
	public static void eliminarAlumno(String lu) {
		alumnos.removeIf(alumno -> alumno.getLu().equals(lu));
	}
}
