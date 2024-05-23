package graus;

public class TesteMedidorAdapter {
	
	public static void main(String[] args) {
		
		MedidorFarenheit grausBrasil = new MedidorFarenheit();
		AdapterMedidaDeTemperatura conversor = new AdapterMedidaDeTemperatura(grausBrasil);
		System.out.println(grausBrasil.getTemperaturaFarenheit());
		System.out.println("-------------------------------------");
		System.out.println(conversor.medirTemperatura());
	}	
}
