package incremental;

public class Incremental {
	private static Incremental instance;
	private static int count = 0;
	private int numero;
	
	public Incremental() {
		numero = ++count;
	}
	
	public static Incremental GetInstance() {
		if(instance == null)
			instance = new Incremental();
		return instance;
	}
	
	public String toString() {
		return "Incremental: " + numero;
	}
}
