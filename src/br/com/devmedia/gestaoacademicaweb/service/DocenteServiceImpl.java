package br.com.devmedia.gestaoacademicaweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.devmedia.gestaoacademicaweb.dao.DocenteDAO;
import br.com.devmedia.gestaoacademicaweb.model.Docentes;

@Service("docenteService")
public class DocenteServiceImpl implements DocenteService{

	@Autowired
	private DocenteDAO docenteDAO;
	
	@Transactional
	public void adicionarDocente(Docentes docente) {
		docenteDAO.adicionarDocente(docente);
	}

	@Transactional
	public void removerDocente(int id) {
		docenteDAO.removerDocente(id);
	}

	@Override
	public List<Docentes> listarDocentes() {
		return docenteDAO.listaDocentes();
	}

}
