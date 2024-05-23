package ex3;

public class Elevador {
	
	private int andarAtual;
	private int totalDeAndares;
	private int capacidadeDoElevador;
	private int pessoasPresentesNoElevador;
	
	public Elevador(int capacidadeDoElevador, int totalDeAndares) {
		this.capacidadeDoElevador = capacidadeDoElevador;
		this.totalDeAndares = totalDeAndares;
		this.andarAtual = 0;
		this.pessoasPresentesNoElevador = 0;
	}
	
	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalDeAndares() {
		return totalDeAndares;
	}

	public void setTotalDeAndares(int totalDeAndares) {
		this.totalDeAndares = totalDeAndares;
	}

	public int getCapacidadeDoElevador() {
		return capacidadeDoElevador;
	}

	public void setCapacidadeDoElevador(int capacidadeDoElevador) {
		this.capacidadeDoElevador = capacidadeDoElevador;
	}

	public int getPessoasPresentesNoElevador() {
		return pessoasPresentesNoElevador;
	}

	public void setPessoasPresentesNoElevador(int pessoasPresentesNoElevador) {
		this.pessoasPresentesNoElevador = pessoasPresentesNoElevador;
	}
	
	public void Entra() {
		if(this.pessoasPresentesNoElevador >= this.capacidadeDoElevador) {
			System.out.println("O elevador est� com a capacidade m�xima de usu�rios no momento.");
		}else{
			this.pessoasPresentesNoElevador += 1;
		}
	}
	
	public void Sai() {
		if(this.pessoasPresentesNoElevador != 0) {
			this.pessoasPresentesNoElevador -= 1;
		}else {
			System.out.println("N�o h� ningu�m no elevador");
		}
	}
	
	public void Sobe() {
		if(this.andarAtual == this.totalDeAndares) {
			System.out.println("N�o h� como subir, pois o elevador est� no ultimo andar.");
		}else {
			this.andarAtual += 1;
		}
	}
	
	public void Desce() {
		if(this.andarAtual == 0) {
			System.out.println("N�o h� como descer, pois o elevador est� no t�rreo");
		}else {
			this.andarAtual-= 1;
		}
	}
	
}
