import java.util.Scanner;
public class PrincipalProduto {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
	    Produto p1 = new Produto ();
		
		System.out.println ("Digite o nome do produto:");
		p1.nome = in.next();
		
		System.out.println ("Digite o código do produto:");
		p1.codigo = in.nextInt();
		
		System.out.println ("Digite o custo do produto:");
		p1.precocusto = in.nextDouble();

		System.out.println ("Digite o preço de venda:");
		p1.precovenda = in.nextDouble();
		
		System.out.println ("Digite a quantidade do produto:");
		p1.quantproduto = in.nextInt();
		
		System.out.println ("Digite a margem de lucro:");
		p1.margemlucro = in.nextDouble();
		

		
		System.out.println ("A Quantidade Atualizada do produto é: "+p1.registrarEntrada(int quatidade));
		
		System.out.println("====================");
		
		System.out.println ("A definição do seu Preço de Venda é: "+p1.definirPrecoVenda(double valor));
		
		System.out.println("====================");
		
		System.out.println("O Valor da sua Venda é:" +p1.calcularPrecoVenda());
		
		System.out.println("====================");
		
		System.out.println("A Quantidade de Porduto Vendida é:" +p1.registrarSaída(int quantidade )());
	}
	

}
