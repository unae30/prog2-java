package sandubao;

public class QueijoFactory extends FabricaAbstrataDeSanduiche {

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
		if(queijo == null)
			return null;
		if(queijo.equalsIgnoreCase("Prato"))
			return new QueijoPrato();
		else if(queijo.equalsIgnoreCase("Mussarela"))
			return new QueijoMussarela();
		else if(queijo.equalsIgnoreCase("Cheddar"))
			return new QueijoCheddar();
		else
			return null;
	}

	@Override
	public ISalada getSalada(String salada) {
		// TODO Auto-generated method stub
		return null;
	}

}
