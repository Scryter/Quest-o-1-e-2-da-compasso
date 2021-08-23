import java.time.LocalDate;
import java.util.List;
import javax.persistence.EntityManager;



public class ProdutoDao {
	private EntityManager em;

	public ProdutoDao(EntityManager em) {
		super();
		this.em = em;
	}
	
    public Produto atualizar(Produto produto) {
        produto.setDataAlteracao(LocalDate.now());
        return em.merge(produto);
    }
    
	public void cadastrar(Produto produto)
	{
		this.em.persist(produto);
	}
	
    public void deletar(Produto produto) {
        produto = this.em.merge(produto);
        this.em.remove(produto);
    }
    
    public List<Produto> listar() {
        return this.em.createQuery("SELECT p FROM Produto", Produto.class).getResultList();
    }

    public void limparTabela() {
        this.em.createQuery("DELETE FROM Produto").executeUpdate();
    }
}
