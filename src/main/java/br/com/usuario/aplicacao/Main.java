package br.com.usuario.aplicacao;

import br.com.usuario.dao.UserDAO;
import br.com.usuario.model.User;

public class Main {

	public static void main(String[] args) {
		UserDAO usuarioDao = new UserDAO();
		
		User usuario = new User();
		usuario.setNome("Victor Eduardo");
		usuario.setSobrenome("Prudente");
		
		//usuarioDao.save(usuario);
		
		User u1 = new User();
		u1.setNome("Daniel Vitor");
		u1.setSobrenome("da Silva");
		u1.setId(2);
		
		//usuarioDao.update(u1);
		
		usuarioDao.deleteByID(2);
		
		for(User u : usuarioDao.getUser()) {
			System.out.println("Usuário: "+u.getNome());
		}
	}

}
