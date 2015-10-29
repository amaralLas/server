package br.com.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.dao.UsuarioDAO;
import br.com.pojo.Usuario;

@ManagedBean(name="userBean")
public class UsuarioMB {
	
	Usuario usuario = new Usuario();

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
  public void addUser(){
	  UsuarioDAO dao = new UsuarioDAO();
	  dao.insert(usuario);
  }
  
  public void delUser(){
	  UsuarioDAO dao = new UsuarioDAO();
	  dao.delete(usuario);
  }

  public void alterUser(){
	  UsuarioDAO dao = new UsuarioDAO();
	  dao.update(usuario);
  }
  
  public Usuario getUser(){
	  UsuarioDAO dao = new UsuarioDAO();
	  return dao.getId(usuario.getId());
  }
  
  public List<Usuario> getAllUser(){
	  UsuarioDAO dao = new UsuarioDAO();
	  return dao.getAll();
  }
}
