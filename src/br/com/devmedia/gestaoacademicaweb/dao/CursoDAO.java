package br.com.devmedia.gestaoacademicaweb.dao;

import java.util.List;

import br.com.devmedia.gestaoacademicaweb.pojo.Curso;

public interface CursoDAO {
	public void adicionarDocente(Curso curso);
	public void removerDocente(int id);
	public void atualizaDocente(Curso curso);
	public List<Curso> listaDocentes();
	public Curso docenteById(int id);
}
