
public class Conta {
	
		public static void main(String[] args) {
			MainConta c1 = new MainConta();
			
			//Abre a conta
			c1.abreConta(1216, "Renam Gomes Felix Bueno", 200.00);
			
			System.out.println("Número da conta: "+ c1.numeroConta);
			System.out.println("Nome: "+ c1.nomeCorrentista);
			System.out.println("Saldo: "+ c1.saldo);
			
			System.out.println("=====================================");
			
			//Deposita o valor
			c1.depositaValor(150.00);
			
			System.out.println("=====================================");
			
			//Retira o valor
			c1.retiraValor(300.00);
			
			System.out.println("=====================================");
			
			//Retira o valor e retorna o saldo
			c1.retiraValorRetornaSaldo(100.00);
			System.out.println("Mostre o saldo atualizado: "+ c1.saldo);
			
			System.out.println("=====================================");
			
			//Exibe o saldo
			c1.exibirSaldo();
		}
	}


