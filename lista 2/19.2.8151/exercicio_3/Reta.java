package reta;

public class Reta {
	
	int coeficienteAngular;
	int coeficienteLinear;
	
	Reta (int coeficienteAngular, int coeficienteLinear){
		this.coeficienteAngular = coeficienteAngular;
		this.coeficienteLinear = coeficienteLinear;	
	}
	
	public int getCoeficienteAngular() {
		return this.coeficienteAngular;
	}

	public void setCoeficienteAngular(int coeficienteAngular) {
		this.coeficienteAngular = coeficienteAngular;
	}
	
	public int getCoeficienteLinear() {
		return this.coeficienteLinear;
	}
	
	public void setCoeficienteLinear(int coeficienteLinear) {
		this.coeficienteLinear = coeficienteLinear;
	}
	
	public void pontoPertencente(int x, int y) {
		int m = getCoeficienteAngular();
		int n = getCoeficienteLinear();
		
		if(((m*x)-n) == y) {
			System.out.println("Esse ponto pertence a reta.");
		}else {
			System.out.println("Esse ponto não pertence a reta.");
		}
	}
	
	public void formulaDaReta() {
		System.out.println("Y =" + this.coeficienteAngular + "x" + "+" + this.coeficienteLinear);
	}
	
	public void intersecao(Reta q, Reta h, int x, int y) {
	       
	       if(q.coeficienteAngular==h.coeficienteAngular || q.coeficienteAngular<0 || h.coeficienteAngular<0){
	           System.out.println("Não existe ponto de intersecção");
	       }else{
	           System.out.println("Ponto de intersecção: ("+x+" , "+y+")");
	       }
	    
}
}

		


	