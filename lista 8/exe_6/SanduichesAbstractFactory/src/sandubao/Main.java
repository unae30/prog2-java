package sandubao;

public class Main {

	public static void main(String[] args) {
		
		FabricaAbstrataDeSanduiche sandubao = Lanchonete.GetFactory("Sanduiches");	
		ISanduiches sanduiche = sandubao.getSanduiches("Lanchonete CG");
		sanduiche.ingredientes();
		
		FabricaAbstrataDeSanduiche pao = Lanchonete.GetFactory("Pão");
		IPao pao1 = pao.getPao("Integral");
		pao1.tipo();
		
		FabricaAbstrataDeSanduiche presunto = Lanchonete.GetFactory("Presunto");
		IPresunto presunto1 = presunto.getPresunto("Frango");
		presunto1.tipo();
		
		FabricaAbstrataDeSanduiche queijo = Lanchonete.GetFactory("Queijo");
		IQueijo queijo1 = queijo.getQueijo("Mussarela");
		queijo1.tipo();
		
		FabricaAbstrataDeSanduiche salada = Lanchonete.GetFactory("Salada");
		ISalada salada1 = salada.getSalada("Sem verdura");
		salada1.tipo();
		

	}

}
