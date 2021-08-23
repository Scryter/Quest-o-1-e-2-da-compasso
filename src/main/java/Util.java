import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Util {
	private  static EntityManagerFactory FACTORY =  Persistence.createEntityManagerFactory("loja");
	
	public static EntityManager getEntityManager()
	{
		return FACTORY.createEntityManager();
	}
}
