package br.com.devmedia.gestaoacademicaweb.service;

import java.util.List;

import br.com.devmedia.gestaoacademicaweb.model.Docentes;

public interface DocenteService {
	
	public void adicionarDocente(Docentes docente);
	public void removerDocente(int id);
	public List<Docentes> listarDocentes();
	
}
