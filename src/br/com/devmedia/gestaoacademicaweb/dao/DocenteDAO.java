package br.com.devmedia.gestaoacademicaweb.dao;

import java.util.List;

import br.com.devmedia.gestaoacademicaweb.model.Docentes;

public interface DocenteDAO {

	public void adicionarDocente(Docentes docente);
	public void removerDocente(int id);
	public List<Docentes> listaDocentes();
	
}
