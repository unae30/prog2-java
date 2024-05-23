package letrab;

import java.util.Comparator;

public class SalarioComparator implements Comparator<Empregado>{

	@Override
	public int compare(Empregado x, Empregado y) {
		if(x.getSalario() < y.getSalario())
			return -1;
		if(x.getSalario() > y.getSalario())
			return 1;		
		return 0;
	}

}
