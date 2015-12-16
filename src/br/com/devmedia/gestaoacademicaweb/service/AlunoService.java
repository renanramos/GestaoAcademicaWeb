package br.com.devmedia.gestaoacademicaweb.service;

import java.util.List;

import br.com.devmedia.gestaoacademicaweb.pojo.Aluno;

public interface AlunoService {

	public void adicionarAluno(Aluno aluno);
	public void removerAluno(int id);
	public void atualizaAluno(Aluno aluno);
	public List<Aluno> listaAlunos();
	public Aluno alunoById(int id);
	
}
