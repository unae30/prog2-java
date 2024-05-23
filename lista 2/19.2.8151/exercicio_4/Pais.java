package paises;
import java.util.ArrayList;

public class Pais {
	
	private String codigoISO;
	private String nomeDoPais;
	private long populacaoDoPais;
	private long dimensaoDoPais;
	private ArrayList<String> paisesVizinhos;
	
	
	//construtor
	Pais(String codigoISO, String nomeDoPais, long populacaoDoPais, long dimensaoDoPais){
		this.codigoISO = codigoISO;
		this.nomeDoPais = nomeDoPais;
		this.populacaoDoPais = populacaoDoPais;
		this.dimensaoDoPais = dimensaoDoPais;
		
		paisesVizinhos = new ArrayList<String>();
		
	}
	
	//set e get codigoISO
	public void setCodigoISO(String codigoISO) {
		this.codigoISO = codigoISO;
	}
	
	public String getCodigoISO() {
		return codigoISO;
	}
	
	//set e get nomeDoPais
	public void setNomeDoPais(String nomeDoPais) {
		this.nomeDoPais = nomeDoPais;
	}
	
	public String getNomeDoPais() {
		return nomeDoPais;
	}
	
	//set e get populacaoDoPais
	public void setPopulacaoDoPais(long populacaoDoPais) {
		this.populacaoDoPais = populacaoDoPais;
	}
	
	public long getPopulacaoDoPais() {
		return populacaoDoPais;
	}
	
	//set e get dimensaoDoPais
	public void setDimensaoDoPais(long dimensaoDoPais) {
		this.dimensaoDoPais = dimensaoDoPais;
	}
	
	public long getDimensaoDoPais() {
		return dimensaoDoPais;
	}
	
	public void setPaisesVizinhos (ArrayList<String> paisesVizinhos) {
		this.paisesVizinhos = paisesVizinhos;
	}
	
	public ArrayList<String> getPaisesVizinhos(){
		return paisesVizinhos;
	}
	
	//sao limitrofes? 
	public boolean saoVizinhos(Pais x) {
		return (paisesVizinhos.indexOf(x.codigoISO.toUpperCase()) >= 0);
	}
	
	
	//densidade populacional
	public float densidadePopulacional() {
		return (float)populacaoDoPais / dimensaoDoPais;
	}
	
	//mostrar os 3 vizinhos
	public void mostrarPaisesVizinhos() {
		System.out.println("Os países vizinhos são:");
		for(int i=0; i<paisesVizinhos.size(); i++) {
			System.out.println(paisesVizinhos.get(i));
			System.out.println();
		}
	}
}
