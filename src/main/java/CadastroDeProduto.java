import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class CadastroDeProduto {
	
	
	EntityManager em = Util.getEntityManager();
	ProdutoDao dao = new ProdutoDao(em);
	
    public void cadastrar(Produto p){
    	
    	
        em.getTransaction().begin();
        dao.cadastrar(p);
        em.getTransaction().commit();
        em.close();
    }

    public void atualizar(Produto p){
        em.getTransaction().begin();
        p = dao.atualizar(p);
        em.getTransaction().commit();
        em.close();
    }

    public List<Produto> listar(){
        return dao.listar();
    }

    public void deletar(Produto p){
        em.getTransaction().begin();
        dao.deletar(p);
        em.getTransaction().commit();
        em.clear();
    }

    public void close() {
        this.em.close();
    }
}
