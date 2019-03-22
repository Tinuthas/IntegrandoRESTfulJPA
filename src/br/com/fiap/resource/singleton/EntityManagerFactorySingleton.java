package br.com.fiap.resource.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {
	
	// 1 - ATRIBUTO EST�TICO DO OBJETO QUE SER� �NICO
	private static EntityManagerFactory emf;
	
	// 2 - CONTRUTOR PRIVADO
	private EntityManagerFactorySingleton() {}
	
	// 3 - M�TODO EST�TICO QUE INSTANCIA O OBJETO �NICO
	public static EntityManagerFactory getInstance() {
		if(emf == null) {
			emf = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		}
		return emf;
	}
	
}
