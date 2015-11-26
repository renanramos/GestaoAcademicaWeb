package br.com.devmedia.gestaoacademicaweb.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.devmedia.gestaoacademicaweb.model.Docentes;

@Repository
public class DocenteDAOImpl implements DocenteDAO{

	@Autowired
	private SessionFactory sessionFactory;
	private Transaction tx;
	private Session session;	
	
	public void adicionarDocente(Docentes docente) {				
		try {											
			session = sessionFactory.openSession();
			tx = session.beginTransaction();			
			session.save(docente);
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			session.close();
			e.printStackTrace();
		}
	}

	public void removerDocente(int id) {
		try{
			session = sessionFactory.openSession();
			Docentes docente = (Docentes) session.load(Docentes.class, id);
			if(docente != null){				
				tx = session.beginTransaction();
				session.delete(docente);
				tx.commit();
				session.close();
			}
		}catch(Exception e){
			tx.rollback();
			session.close();
			e.printStackTrace();
		}

	}

	@Override
	public List<Docentes> listaDocentes() {	
		List<Docentes> docentes = new ArrayList<Docentes>();
		try{
			session = sessionFactory.openSession();			
			tx = session.beginTransaction();
			docentes = session.createQuery("from Docentes").list();
			tx.commit();
			session.close();
		}catch(Exception e){
			tx.rollback();
			session.close();
			e.printStackTrace();
		}			
		return docentes;
	}

	@Override
	public void atualizaDocente(int id) {
		Docentes docente = docenteById(id);
		try{
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.update(docente);
			tx.commit();
			session.close();
		}catch(Exception e){
			tx.rollback();
			session.close();
			e.printStackTrace();
		}
	}

	@Override
	public Docentes docenteById(int id) {
		Docentes docente = null;
		try{
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			docente = (Docentes) session.load(Docentes.class, id);			
			tx.commit();
			session.close();
		}catch(Exception e){
			tx.rollback();
			session.close();
			e.printStackTrace();
		}
		
		return docente;
	}

}
