package exe8;


public class Controlador {

	public static void main(String[] args) {
		
		Divisao divisao = new Divisao();
	
		try {
			divisao.setNum1(10);
			divisao.setNum2(2);
			System.out.println(divisao.resultado());
		}catch(Exception e) {
			System.out.println("ERRO INESPERADO!");
			Thread.dumpStack();
		}
	}
	
}
