package formasGeometricas;


public class FormasFactory {
	
	public static IFormasGeometricas CriarFormas(String nome) {
		if(nome == null)
			return null;
		if(nome.equalsIgnoreCase("C�rculo"))
			return new Circulo();
		else if (nome.equalsIgnoreCase("Quadrado"))
			return new Quadrado();
		else if (nome.equalsIgnoreCase("Tri�ngulo"))
			return new Triangulo();
		else 
			return null;
	}
}
