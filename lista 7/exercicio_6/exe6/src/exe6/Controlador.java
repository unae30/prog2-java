package exe6;

public class Controlador {

	public static void main(String[] args) {
		
		Conta minhaConta = new Conta();
		minhaConta.deposita(100);
		minhaConta.setLimite(100);
		
		try {
			
		minhaConta.saca(1000);
		minhaConta.imprimeExtrato();
		
		}catch(ContaExcecao e) {
			
			System.out.println("N�o foi poss�vel, o seu limite est� abaixo do valor de saque.");
		}
		

	}

}
