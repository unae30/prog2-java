package carr0s;

public class FabricaFord extends FabricaAbstrataDeCarros{

	@Override
	public CarroPopular FactoryCarroPopular(String nome) {
		if(nome.equalsIgnoreCase("Fiesta"))
			return new Fiesta("Ford");
		else
			return new CarroPopular(nome);
	}

	@Override
	public CarroSedan FactoryCarroSedan(String nome) {
		if(nome.equalsIgnoreCase("Fiesta Sedan"))
			return new FiestaSedan("Ford");
		else
			return new CarroSedan(nome);
	}

}
