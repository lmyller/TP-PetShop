package lmv.daw.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import lmv.daw.modelo.Login;

public class LoginDAO
{ 
	EntityManager manager; 
	
	public LoginDAO() 
	{
		manager = new JPAUtil().getEntityManager();
	}

	public boolean validaLogin(Login login) 
	{
		if (login == null) 
			throw new IllegalArgumentException("Usuário não deve ser nulo");
		
		Query query = manager.createQuery(" SELECT u FROM Usuario u where u.login = :login and u.senha = :senha ", Login.class);

		query.setParameter("login", login.getLogin()); query.setParameter("senha", login.getSenha()); 
		
		@SuppressWarnings("unchecked")
		List<Login> usuarios = query.getResultList(); 
		
		if (usuarios != null && usuarios.size() == 0) 
			return false;
		else 
			return true; 
	}
}
