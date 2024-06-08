package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unju.fi.model.Carrera;

public class ListadoCarreras {
	public static List<Carrera> carreras = new ArrayList<>();
	
	public static List<Carrera> listarCarreras(){
		return carreras.stream().filter(c -> c.isEstado() == true).collect(Collectors.toList());
	}
	
	public static Carrera buscarCarreraPorCodigo(String codigo) {
		for (Carrera c : carreras) {
			if(c.getCodigo().equals(codigo)) {
				return c;
			}
		}
		return null;
	}
	
	public static void agregarCarrera(Carrera carrera) {
		carrera.setEstado(true);
		boolean existe = false;
		for(Carrera c : carreras) {
			if(c.getCodigo().equals(carrera.getCodigo())) {
				existe = true;
				break;
			}
		}
		if(!existe)carreras.add(carrera);
	}
	
	public static void modificarCarrera(Carrera carreraModificada) {
		System.out.println(carreraModificada.getCodigo());
		carreraModificada.setEstado(true);
		for (int i = 0; i < carreras.size(); i++) {
			Carrera carrera = carreras.get(i);
			if(carrera.getCodigo().equals(carreraModificada.getCodigo())) {
				carreras.set(i, carreraModificada);
				break;
			}
		}
	}
	
	public static void eliminarCarrera(String codigo) {
		//borrado físico
		//carreras.removeIf(carrera -> carrera.getCodigo().equals(codigo));
		
		//borrado logico
		carreras.forEach(carrera -> {
			if(carrera.getCodigo().equals(codigo)) carrera.setEstado(false);
		});
	}
}

