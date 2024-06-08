package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Docente;


	public class ListadoDocentes {
	public static List<Docente> docentes = new ArrayList<>();
	
	public static List<Docente> listarDocentes(){
		return docentes;
	}
	
	public static Docente buscarDocentePorLegajo(String legajo) {
		for (Docente docente : docentes) {
			if(docente.getLegajo().equals(legajo)) {
				return docente;
			}
		}
		return null;
	}
	
	public static void agregarDocente(Docente docente) {
		boolean existe = false;
		for(Docente d : docentes) {
			if(d.getLegajo().equals(docente.getLegajo())) {
				existe = true;
				break;
			}
		}
		if(!existe)docentes.add(docente);
	}
	
	public static void modificarDocente(Docente docenteModificado) {
		for (int i = 0; i < docentes.size(); i++) {
			Docente docente = docentes.get(i);
			if(docente.getLegajo().equals(docenteModificado.getLegajo())) {
				docentes.set(i, docenteModificado);
				break;
			}
		}
	}
	
	public static void eliminarDocente(String legajo) {
		docentes.removeIf(docente -> docente.getLegajo().equals(legajo));
	}
}
