package br.com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.pojo.Usuario;
import br.com.util.JPAUtils;

public class UsuarioDAO {

	public void insert(Usuario usuario){
		EntityManager manager = JPAUtils.getFactory().createEntityManager();
		manager.getTransaction().begin();
		manager.persist(usuario);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void delete(Usuario usuario){
		EntityManager manager = JPAUtils.getFactory().createEntityManager();
		manager.getTransaction().begin();
	    manager.remove(usuario);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void update(Usuario usuario){
		EntityManager manager = JPAUtils.getFactory().createEntityManager();
		manager.getTransaction().begin();
	    manager.merge(usuario);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public Usuario getId(int idUsuario){
		EntityManager manager = JPAUtils.getFactory().createEntityManager();
		manager.getTransaction().begin();
	    Usuario retorno = manager.find(Usuario.class, idUsuario);
		manager.getTransaction().commit();
		manager.close();
		return retorno;
	}
	
	public List<Usuario> getAll(){
		EntityManager manager = JPAUtils.getFactory().createEntityManager();
		manager.getTransaction().begin();
		List<Usuario> usuarios;
	    Query query= manager.createQuery("SELECT u FROM ead_ususario u", Usuario.class);
	    usuarios = query.getResultList();
		manager.getTransaction().commit();
		manager.close();
		return usuarios;
	}
	
}
