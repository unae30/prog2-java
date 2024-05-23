package sandubao;

public class Lanchonete {
	public static FabricaAbstrataDeSanduiche GetFactory(String fabrica) {
		if(fabrica.equalsIgnoreCase("Sanduiches"))
			return new SanduichesFactory();
		else if(fabrica.equalsIgnoreCase("Pão"))
			return new PaoFactory();
		else if(fabrica.equalsIgnoreCase("Presunto"))
			return new PresuntoFactory();
		else if(fabrica.equalsIgnoreCase("Queijo"))
			return new QueijoFactory();
		else if(fabrica.equalsIgnoreCase("Salada"))
			return new SaladaFactory();
		else
			return null;
	}
}
