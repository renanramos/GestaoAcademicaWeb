package br.com.devmedia.gestaoacademicaweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.devmedia.gestaoacademicaweb.dao.DocenteDAO;
import br.com.devmedia.gestaoacademicaweb.pojo.Docente;
import br.com.devmedia.gestaoacademicaweb.service.DocenteService;

@Service("docenteService")
public class DocenteServiceImpl implements DocenteService{

	@Autowired
	private DocenteDAO docenteDAO;
	
	@Transactional
	public void adicionarDocente(Docente docente) {
		docenteDAO.adicionarDocente(docente);
	}

	@Transactional
	public void removerDocente(int id) {
		docenteDAO.removerDocente(id);
	}

	@Override
	public List<Docente> listarDocentes() {
		return docenteDAO.listaDocentes();
	}

	@Transactional
	public void atualizaDocente(Docente docente) {
		docenteDAO.atualizaDocente(docente);
	}

	@Override
	public Docente docenteById(int id) {		
		return docenteDAO.docenteById(id);
	}

}
