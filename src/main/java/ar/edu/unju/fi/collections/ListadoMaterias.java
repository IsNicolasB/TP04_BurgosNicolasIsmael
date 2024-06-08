package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Carrera;
import ar.edu.unju.fi.model.Materia;


public class ListadoMaterias {
public static List<Materia> materias = new ArrayList<>();
	
	public static List<Materia> listarMaterias(){
		return materias;
	}
	
	public static Materia buscarMateriaPorCodigo(String codigo) {
		for (Materia materias : materias) {
			if(materias.getCodigo().equals(codigo)) {
				return materias;
			}
		}
		return null;
	}
	
	public static void agregarMateria(Materia materia) {
		boolean existe = false;
		for(Materia m : materias) {
			if(m.getCodigo().equals(materia.getCodigo())) {
				existe = true;
				break;
			}
		}
		if(!existe)materias.add(materia);
	}
	
	public static void modificarMateria(Materia materiaModificada) {
		for (int i = 0; i < materias.size(); i++) {
			Materia materia = materias.get(i);
			if(materia.getCodigo().equals(materiaModificada.getCodigo())) {
				materias.set(i, materiaModificada);
				break;
			}
		}
	}
	
	public static void eliminarMateria(String codigo) {
		materias.removeIf(materia -> materia.getCodigo().equals(codigo));
	}
}
