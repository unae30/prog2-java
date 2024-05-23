package tryingex2;

public class Um extends Produto {
	
	private double newCusto;
	
	public Um(String i, double c) {
		super(i, c);
	}
	

	public double getNewCusto() {
		return newCusto;
	}


	@Override
	public String toString(double i) {
		String id = String.valueOf(i);
		return id;
	}

	@Override
	public void novoCusto(double nc) {
		this.newCusto = nc;
	}

}