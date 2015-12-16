package br.com.devmedia.gestaoacademicaweb.dao;

import java.util.List;

import br.com.devmedia.gestaoacademicaweb.pojo.Docente;

public interface DocenteDAO {

	public void adicionarDocente(Docente docente);
	public void removerDocente(int id);
	public void atualizaDocente(Docente docente);
	public List<Docente> listaDocentes();
	public Docente docenteById(int id);
	
}
