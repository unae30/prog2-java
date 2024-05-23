package principal;

public class Lampada {
	
	private int watts;
	private String estados;
	private int luminosidade;
	private boolean estaLigada;


	private int contadorLigada = 0;
	private static int ContadorInstancias = 0;

	//construtores
	public Lampada() {
		this.watts = 60;
		Lampada.ContadorInstancias++;
		System.out.println("O total de l�mpadas criadas �: " + Lampada.ContadorInstancias);
		
	}
	
	public Lampada(int watts) {
		this.watts = watts;
		Lampada.ContadorInstancias++;
		System.out.println("O total de l�mpadas criadas �: " + Lampada.ContadorInstancias);
	}

	
	//getters e setters

	public int getWatts() {
		return watts;
	}
	public void setWatts(int watts) {
		this.watts = watts;
	}
	public String getEstados() {
		return estados;
	}
	public void setEstados(String estados) {
		this.estados = estados;
	}
	public int getLuminosidade() {
		return luminosidade;
	}

	public void setLuminosidade(int luminosidade) {
		this.luminosidade = luminosidade;
	}	
	
	public boolean getEstaLigada() {
		return estaLigada;
	}

	public void setEstaLigada(boolean estaLigada) {
		this.estaLigada = estaLigada;
	}

	//m�todos
	
	public void Luminosidade(int luminosidade) {
		if(this.estaLigada == true) {
			if(luminosidade == 0) {
				this.luminosidade = luminosidade;
				this.estados = "apagada";
			}
			else {
				if(luminosidade > 0 && luminosidade <100) {
					this.luminosidade = luminosidade;
					this.estados = "meia-luz";
				}
				if(luminosidade == 100) {
					this.luminosidade = luminosidade;
					this.estados = "acesa";
				}
			}
		}
		else {
			System.out.println("N�o � poss�vel alterar a luminosidade pois a lampada esta desligada.");
		}
	}
	
	public void Acender() {
		if(this.estaLigada == false) {
			setEstaLigada(true);
			contadorLigada++;
		}
		else{
			System.out.println("A luz j� est� acesa.");
		}
	}
	
	public void Desligar() {
		if(this.estaLigada == true) {
			setEstaLigada(false);	
		}
		else{
			System.out.println("A luz j� est� desligada.");
		}

	}
	
	public boolean �Economica() {
		if(this.watts < 40) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public void quantasVezesFoiLigada() {
		System.out.println("A l�mpada foi ligada " + contadorLigada + "x .");
	}	
	
}
