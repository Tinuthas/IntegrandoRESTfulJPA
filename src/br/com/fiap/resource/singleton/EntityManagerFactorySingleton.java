package br.com.fiap.resource.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {
	
	// 1 - ATRIBUTO ESTÁTICO DO OBJETO QUE SERÁ ÚNICO
	private static EntityManagerFactory emf;
	
	// 2 - CONTRUTOR PRIVADO
	private EntityManagerFactorySingleton() {}
	
	// 3 - MÉTODO ESTÁTICO QUE INSTANCIA O OBJETO ÚNICO
	public static EntityManagerFactory getInstance() {
		if(emf == null) {
			emf = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		}
		return emf;
	}
	
}
