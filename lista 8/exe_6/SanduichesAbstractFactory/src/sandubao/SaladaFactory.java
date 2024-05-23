package sandubao;

public class SaladaFactory extends FabricaAbstrataDeSanduiche {

	@Override
	public ISanduiches getSanduiches(String sanduiche) {
		// TODO Auto-generated method stub
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
		if(salada == null)
			return null;
		if(salada.equalsIgnoreCase("Sem verdura"))
			return new SemVerdura();
		else if(salada.equalsIgnoreCase("Com verdura"))
			return new ComVerdura();
		else
			return null;
	}

}
