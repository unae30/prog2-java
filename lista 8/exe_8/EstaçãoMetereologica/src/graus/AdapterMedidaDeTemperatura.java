package graus;

public class AdapterMedidaDeTemperatura implements MedidorCelsiusIF{
	
	private MedidorFarenheit graus;
	
	public AdapterMedidaDeTemperatura(MedidorFarenheit graus) {
		this.graus = graus;
	}
	
	@Override
	public double medirTemperatura() {
		double resultado = (graus.getTemperaturaFarenheit()- 32)/1.8;
		return resultado;
	}
	
}
