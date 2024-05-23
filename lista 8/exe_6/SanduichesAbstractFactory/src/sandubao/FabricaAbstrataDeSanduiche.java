package sandubao;

public abstract class FabricaAbstrataDeSanduiche {

	public abstract ISanduiches getSanduiches(String sanduiche);
	public abstract IPao getPao(String pao);
	public abstract IPresunto getPresunto(String presunto);
	public abstract IQueijo getQueijo(String queijo);
	public abstract ISalada getSalada(String salada);
	
}
