package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

public class JPAUtil {

	private static final String PERSISTENCE_UNIT = "mysqlconexion";
	private static EntityManagerFactory fabrica;
	
	private static EntityManagerFactory getFabrica() {
		if (fabrica == null)
			try {
				fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
			} catch (PersistenceException ex) {
				System.err.println("ERROR al crear EMF: " + ex.getMessage());
			}

		return fabrica;
	}
	
	public static EntityManager getEntityManager() {
		try {
			return getFabrica().createEntityManager();
		} catch (IllegalStateException | PersistenceException ex) {
			System.err.println("No se pudo obtener el EntityManager: " + ex.getMessage());
			throw ex;
		}
	}

	public static void closeEmf() {
		if (fabrica != null && fabrica.isOpen())
			fabrica.close();
	}
	
}
