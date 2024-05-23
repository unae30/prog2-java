package reta;

public class Main {
	public static void main(String[] args) {
		Reta teste = new Reta(0, 0);
		Reta teste1 = new Reta(0,0);
		Reta teste2 =new Reta(0,0);
		int x=0, y=0;

		teste.pontoPertencente(x, y);
		teste.formulaDaReta();
		teste2.intersecao(teste, teste1, x, y);
		
	}
}
