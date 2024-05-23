package exe7;

public class Conta {
	private double total;
	private double limite;
	private double saque;
	

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
	}
	
	
	// metodos
	public void deposita(double valor) {
		this.total = valor;
	}
	
	
	public void saca(double valor) throws ContaExcecao{
		if(valor > this.limite) {
			ContaExcecao e = new ContaExcecao("O valor de saque nao corresponde ao limite", this.total);
			throw e;
		}
		this.saque = valor;
		setTotal((total-valor));
		
	}
	
	public void imprimeExtrato(){
		System.out.println("Saldo em conta: " + this.total);
		System.out.println("Valor de saque: " + this.saque);		
	}
}
