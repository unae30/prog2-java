package sandubao;

public class SanduichesFactory extends FabricaAbstrataDeSanduiche {

	@Override
	public ISanduiches getSanduiches(String sanduiche) {
		if(sanduiche == null)
			return null;
		if(sanduiche.equalsIgnoreCase("Lanchonete CG"))
			return new SanduichesCG();
		else if(sanduiche.equalsIgnoreCase("Lanchonete JP"))
			return new SanduichesJP();
		else if(sanduiche.equals("Lanchonete RT"))
			return new SanduichesRT();
		else
			return null;
	}

	@Override
	public IPao getPao(String pao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPresunto getPresunto(String presunto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IQueijo getQueijo(String queijo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ISalada getSalada(String salada) {
		// TODO Auto-generated method stub
		return null;
	}

}
