package br.com.caelum.livraria.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.caelum.livraria.modelo.Livro;

/**
 * @author Ramon Vieira
 *
 */

@Stateless
public class LivroDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public void salva(Livro livro) {
		entityManager.persist(livro);
	}
	
	public List<Livro> todosLivros() {
		return entityManager.createQuery("select l From Livro l",Livro.class).getResultList();
	}
	
}
