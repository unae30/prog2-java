package exercicio_3;

public class Restaurante extends Empresa {
	
	private String tipoDeComida;
	private double precoMedioPrato;
	
	
	//contrutores
	public Restaurante(String nome, String endereco, String cidade, String estado, String CEP, String telefone) {
		super(nome, endereco, cidade, estado, CEP, telefone);
	}
	
	public Restaurante(String nome, String endereco, String cidade, String estado, String CEP, String telefone, String tipoDeComida, double precoMedioPrato) {
		this(nome, endereco, cidade, estado, CEP, telefone); //aproveitando tudo que ta no const de cima (se tivesse mais açoes elas seriam tranferidas tbm)
		this.tipoDeComida = tipoDeComida;
		this.precoMedioPrato = precoMedioPrato;
	}
	
	
	//getters e setters
	public String getTiposDeComida() {
		return tipoDeComida;
	}
	public void setTiposDeComida(String tipoDeComida) {
		this.tipoDeComida = tipoDeComida;
	}
	public double getPrecoMedioPrato() {
		return precoMedioPrato;
	}
	public void setPrecoMedioPrato(double precoMedioPrato) {
		this.precoMedioPrato = precoMedioPrato;
	}
	
	//método print
	
	public void imprimeDadosRestaurante() {
		super.imprimir();
		System.out.println("TIPO DE COMIDA: " + tipoDeComida);
		System.out.println("PREÇO MÉDIO DO PRATO : " + precoMedioPrato);
	}
	
}
