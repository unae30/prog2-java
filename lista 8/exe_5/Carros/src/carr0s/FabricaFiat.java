package carr0s;

public class FabricaFiat extends FabricaAbstrataDeCarros{

	@Override
	public CarroPopular FactoryCarroPopular(String nome) {
		if(nome.equalsIgnoreCase("Pálio"))
			return new Palio("Fiat");
		else
			return new CarroPopular(nome);
	}

	@Override
	public CarroSedan FactoryCarroSedan(String nome) {
		if(nome.equalsIgnoreCase("Siena"))
			return new Siena("Fiat");
		else
			return new CarroSedan(nome);
	}
	
}
