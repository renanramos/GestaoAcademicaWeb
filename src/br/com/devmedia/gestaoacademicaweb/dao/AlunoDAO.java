package br.com.devmedia.gestaoacademicaweb.dao;

import java.util.List;

import br.com.devmedia.gestaoacademicaweb.pojo.Aluno;

public interface AlunoDAO {
	public void adicionarAluno(Aluno aluno);
	public void removerAluno(int id);
	public void atualizaAluno(Aluno aluno);
	public List<Aluno> listaAlunos();
	public Aluno alunoById(int id);
}
