package br.com.devmedia.gestaoacademicaweb.service;

import java.util.List;

import br.com.devmedia.gestaoacademicaweb.pojo.Docente;

public interface DocenteService {
	
	public void adicionarDocente(Docente docente);
	public void removerDocente(int id);
	public void atualizaDocente(Docente docente);
	public List<Docente> listarDocentes();
	public Docente docenteById(int id);
	
}
