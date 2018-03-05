package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class TesteDAO {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = 
			EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();
		
		
		
		em.close();
		fabrica.close();
	}
	
}