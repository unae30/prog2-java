package graus;
import java.util.Random;
public class MedidorCelsius implements MedidorCelsiusIF{

	@Override
	public double medirTemperatura() {
		return new Random().nextDouble();
	}

}
