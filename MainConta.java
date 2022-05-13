
public class MainConta {
		//Atributos
		int numeroConta;
		String nomeCorrentista;
		double saldo;
		
		//Metodos
		
		//Abre a conta
		public void abreConta(int numeroConta, String nomeCorrentista, double saldo) {
			this.numeroConta = numeroConta;
			this.nomeCorrentista = nomeCorrentista;
			this.saldo = saldo;
		}
		
		//Deposita o valor
		public void depositaValor(double valor) {
			System.out.println("O valor depositado é: "+ valor);
		}
		
		//Retira o valor
		public void retiraValor(double valor) {
			if (valor<=saldo) {
				System.out.println("Seu valor pode ser retirado!");
			}
			else {
				System.out.println("Atenção: Seu valor ultrapassa o seu saldo, saldo insuficiente!");
			}
		}
		//Retira o valor e retorna o saldo
		public double retiraValorRetornaSaldo(double valor) {
			this.saldo = this.saldo - valor;
			return this.saldo;
		}
		
		//+ exibirSaldo(): void
		public void exibirSaldo() {
			System.out.println("Seu saldo atual é: "+ this.saldo);
		}
	}



