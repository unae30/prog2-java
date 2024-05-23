package letrab;

import java.util.Comparator;

public class DataComparator implements Comparator<Empregado>{

	@Override
	public int compare(Empregado x, Empregado y) {
		if(x.getDataFinal().isBefore(y.getDataFinal())) 
			return -1;
		if(x.getDataFinal().isAfter(y.getDataFinal()))
			return 1;
		return 0;
	}

}
