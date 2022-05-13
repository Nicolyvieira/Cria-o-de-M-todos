
public class Produto {

	//atributos
	String nome;
	int codigo;
	double precocusto;
	double precovenda;
	int quantproduto;
	double margemlucro;
	
	
	
	
	//metodos
	public void exibirDados() {
		
		System.out.println ("Nome do Produto é:"+ this.nome);
		System.out.println ("O Codigo do Produto é:"+ this.codigo);
		System.out.println ("O Preço de Custo é:"+ this.precocusto);
		System.out.println ("O Preço de Venda é:"+ this.precovenda);
		System.out.println ("A Quantidade do Produto é:"+ this.quantproduto);
		System.out.println ("A Margem de Lucro é:"+ this.margemlucro);
		}
	
     public int registrarEntrada(int quantidade ) {
		
		 return  this.quantproduto = this.quantproduto + quantidade;
	 }
     
     
     public double definirPrecoVenda (double valor ) {
    	 
    	 if (this.precocusto >  valor) {
    		 Você terá prejuízo na sua venda e o valor 
    		 não poderá ser atualizado!!;
    		 
    	 } else (this.precocusto < valor )
    		 
    	 
     }
	public void calcularPrecoVenda() {
		
		return  this.precoVenda * this.margemlucro; 
	}
	
    public double registrarSaída(int quantidade ) {
    	 
    	return this.quantproduto = this.quantproduto - quantidade;
    			
    	 if (this.quantproduto >  quantidade) {
    		 Você não tem produto o suficiente para ser vendido!!
    	
    		 
    	 } else (this.quantproduto < quantidade )
}
