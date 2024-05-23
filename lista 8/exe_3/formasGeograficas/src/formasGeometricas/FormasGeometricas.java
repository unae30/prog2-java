package formasGeometricas;

public class FormasGeometricas {
	
	private IFormasGeometricas forma;
	
	public FormasGeometricas(String forma) {
		this.forma = FormasFactory.CriarFormas(forma);
	}
	
	public IFormasGeometricas getForma() {
		return this.forma;
	}
}
