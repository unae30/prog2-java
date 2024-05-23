package letrab;

import java.util.Comparator;

public class NomeComparator implements Comparator<Empregado>{

	@Override
	public int compare(Empregado x, Empregado y) {
		
		return (x.getNome().compareTo(y.getNome()));	
	}

}
