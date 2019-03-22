package br.com.fiap.resource;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Testes {

	public static void main(String[] args) {
		AulaTO a = new AulaTO();
		a.setMateria("iOS");
		a.setProfessor("Calypso");
		a.setSala("705");
		a.setQuantidade("42");
		try {
			EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
			EntityManager em = fabrica.createEntityManager();
			AulaDAO dao = new AulaDAOImpl(em);
			dao.cadastrar(a);

			dao.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
