import java.util.Scanner;

public class CMain {

	public static void main(String[] args)
	{
		GeradorAutomatico gh = new GeradorAutomatico();
		// TODO Auto-generated method stub
		int continuar = 1;
		while (continuar != 0)
		{
			
	       System.out.println(
	    		   "Digite uma das op��es:\n" +
	    			"    0 - Fechar aplica��o\n"+
	                "    1 - Cadastrar os 3 produtos\n"+
	                "    2 - Atualizar o primeira produto cadastrado\n"+
	                "    3 - Apagar o segundo produto cadastrado"
	            );	
	       Scanner checkin = new Scanner(System.in);
	       int c = checkin.nextInt();
	       if(c == 0)
	       {
	    	   
	       }
	       else if (c == 1)
	       {
	    	   gh.autocadastroProd();
	       }
	       else if (c == 2)
	       {
	    	   gh.atualizarPrimeiroProduto();
	       }
	       else if (c == 3)
	       {
	    	   gh.apagarSegProd();
	       }
	       else if (c == 0)
	    	   break;
	       else
	    	   System.out.println("Op��o inv�lida, deseja cancelar?");
	    	   
			
			
			
			// -- Verifica��o --
			System.out.println("Digite 0 para finalizar ou qualquer tecla para continuar");
			Scanner sc = new Scanner(System.in);
			continuar = sc.nextInt();
		}
	}

}
