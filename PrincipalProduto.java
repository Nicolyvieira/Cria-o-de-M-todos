import java.util.Scanner;
public class PrincipalProduto {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
	    Produto p1 = new Produto ();
		
		System.out.println ("Digite o nome do produto:");
		p1.nome = in.next();
		
		System.out.println ("Digite o c�digo do produto:");
		p1.codigo = in.nextInt();
		
		System.out.println ("Digite o custo do produto:");
		p1.precocusto = in.nextDouble();

		System.out.println ("Digite o pre�o de venda:");
		p1.precovenda = in.nextDouble();
		
		System.out.println ("Digite a quantidade do produto:");
		p1.quantproduto = in.nextInt();
		
		System.out.println ("Digite a margem de lucro:");
		p1.margemlucro = in.nextDouble();
		

		
		System.out.println ("A Quantidade Atualizada do produto �: "+p1.registrarEntrada(int quatidade));
		
		System.out.println("====================");
		
		System.out.println ("A defini��o do seu Pre�o de Venda �: "+p1.definirPrecoVenda(double valor));
		
		System.out.println("====================");
		
		System.out.println("O Valor da sua Venda �:" +p1.calcularPrecoVenda());
		
		System.out.println("====================");
		
		System.out.println("A Quantidade de Porduto Vendida �:" +p1.registrarSa�da(int quantidade )());
	}
	

}
