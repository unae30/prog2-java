package carr0s;

public class TesteFabricaDeCarros {

	public static void main(String[] args) {
		
		FabricaAbstrataDeCarros automovel = new FabricaFord();
		CarroPopular carro1 = automovel.FactoryCarroPopular("Fiesta");
		System.out.println(carro1);
		
		CarroSedan carro2 = automovel.FactoryCarroSedan("Fiesta Sedan");
		System.out.println(carro2);
		
		FabricaAbstrataDeCarros automovel1 = new FabricaFiat();
		CarroPopular carro3 = automovel1.FactoryCarroPopular("Pálio");
		System.out.println(carro3);
		
		CarroSedan carro4 = automovel1.FactoryCarroSedan("Siena");
		System.out.println(carro4);

	}

}
