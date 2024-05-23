package sandubao;

public class PresuntoFactory extends FabricaAbstrataDeSanduiche {

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
		if(presunto == null)
			return null;
		if(presunto.equalsIgnoreCase("Frango"))
			return new PresuntoDeFrango();
		else if(presunto.equalsIgnoreCase("Peru"))
			return new PresuntoDePeru();
		else
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
