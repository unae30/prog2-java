package sandubao;

public class PaoFactory extends FabricaAbstrataDeSanduiche {

	@Override
	public ISanduiches getSanduiches(String sanduiche) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPao getPao(String pao) {
//		if(pao == null)
//			return null;
		if(pao.equalsIgnoreCase("Integral"))
			return new PaoIntegral();
		else if(pao.equalsIgnoreCase("Franc�s"))
			return new PaoFrances();
		else if(pao.equalsIgnoreCase("Bola"))
			return new PaoBola();
		else
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