package br.com.devmedia.gestaoacademicaweb.service;

import java.util.List;

import br.com.devmedia.gestaoacademicaweb.pojo.Curso;

public interface CursoService {
	public void adicionarCurso(Curso curso);
	public void removerCurso(int id);
	public void atualizaCurso(Curso curso);
	public List<Curso> listaCursos();
	public Curso cursoById(int id);
}
