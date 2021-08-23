import java.math.BigDecimal;

public class GeradorAutomatico {

	CadastroDeProduto cadastroDeProduto = new CadastroDeProduto();
	
    private Produto gpu = new Produto("Placa de Video RXT 3090", "Placa de Vídeo EVGA NVIDIA GeForce RTX 3090 - 24 GB", 100, new BigDecimal("16799"));
    private Produto processador = new Produto("Processador Ryzen 5", "Processador AMD Ryzen 5 5600X (AM4/6 Cores/12 Threads/4.6GHz/35MB Cache/Wraith Stealth) *S/Vídeo*", 150, new BigDecimal("2001"));
    private Produto memoriaram = new Produto("Memória RAM 16 GB RGB", "Memória Corsair Vengeance RGB, 16GB (2x8GB), 3200MHz, DDR4, CL16", 500, new BigDecimal("919"));
	
    
    public void autocadastroProd(){

        System.out.println("Cadastrando: " + gpu.toString());
        cadastroDeProduto.cadastrar(gpu);
        System.out.println("Cadastrando: " + processador.toString());
        cadastroDeProduto.cadastrar(processador);
        System.out.println("Cadastrando: " + memoriaram.toString());
        cadastroDeProduto.cadastrar(memoriaram);
    }
    
    public void atualizarPrimeiroProduto(){

        System.out.println("Atualizando registro: " + gpu.toString());

        gpu.setDescricao("Smart Watch Samsung com display Oled");
        gpu.setPreco(new BigDecimal("789"));
        gpu.setQuantidade(120);

        System.out.println("Para: " + gpu.toString());

        cadastroDeProduto.atualizar(gpu);
    }

    public void apagarSegProd(){
        System.out.println("Deletando Registro: " + processador.toString());

        cadastroDeProduto.deletar(processador);
    }
}
