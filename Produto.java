
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
		
		System.out.println ("Nome do Produto �:"+ this.nome);
		System.out.println ("O Codigo do Produto �:"+ this.codigo);
		System.out.println ("O Pre�o de Custo �:"+ this.precocusto);
		System.out.println ("O Pre�o de Venda �:"+ this.precovenda);
		System.out.println ("A Quantidade do Produto �:"+ this.quantproduto);
		System.out.println ("A Margem de Lucro �:"+ this.margemlucro);
		}
	
     public int registrarEntrada(int quantidade ) {
		
		 return  this.quantproduto = this.quantproduto + quantidade;
	 }
     
     
     public double definirPrecoVenda (double valor ) {
    	 
    	 if (this.precocusto >  valor) {
    		 Voc� ter� preju�zo na sua venda e o valor 
    		 n�o poder� ser atualizado!!;
    		 
    	 } else (this.precocusto < valor )
    		 
    	 
     }
	public void calcularPrecoVenda() {
		
		return  this.precoVenda * this.margemlucro; 
	}
	
    public double registrarSa�da(int quantidade ) {
    	 
    	return this.quantproduto = this.quantproduto - quantidade;
    			
    	 if (this.quantproduto >  quantidade) {
    		 Voc� n�o tem produto o suficiente para ser vendido!!
    	
    		 
    	 } else (this.quantproduto < quantidade )
}
