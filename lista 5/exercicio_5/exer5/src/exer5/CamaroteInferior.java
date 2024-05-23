package exer5;

public class CamaroteInferior extends VIP{
	
	private String localizacao = "Camarote Inferior";

	//getters e setters
	public String getLocalizacao() {
		return localizacao;
	}

	//metodo de imprimir localizacao
	
	public void imprimeVIPInf() {
		System.out.println("Selecionado pelo usuário: " + localizacao);
	}	
	
}
