package br.com.devmedia.gestaoacademicaweb.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ALUNOS")
public class Aluno {

	@Id
	@Column(name="ID")
	@GeneratedValue
	private Integer id;

	@Column(name="NOME")
	private String nome;
	
	@Column(name="MATRICULA")
	private String matricula;
		
	@ManyToOne
	@JoinColumn(name="id_curso",nullable=false, insertable=false, updatable=false)
	private Curso curso;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public Curso getId_curso() {
		return curso;
	}

	public void setId_curso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", matricula=" + matricula + ", id_curso=" + curso.getId() + "]";
	}


	
}
