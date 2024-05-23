package exer5;

public class CamaroteSuperior extends VIP{
	
	private float valorAdicional;
	private String localizacao = "Camarote Superior";
	
	//getters e setters
	public float getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(float valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	public String getLocalizacao() {
		return localizacao;
	}
	
	public float valorCamaroteSuperior(){
		float valorFinalCamaroteSuperior = super.valorVIP() + valorAdicional;
		return valorFinalCamaroteSuperior;
	}
	//imprimir
	
	public void ImprimeVIPSup() {
		System.out.println("Selecionado pelo usuário: " + localizacao);
	}
	
}
