package lanchonete;

public class FabricaDeSanduiches {
	
	public static ISanduiches CriarSanduiches(String nome) {
		
			if(nome == null)
				return null;
			if (nome.equalsIgnoreCase("LanchoneteCG"))
				return new SanduicheLanchoneteCG();
			else if(nome.equalsIgnoreCase("LanchoneteJP"))
				return new SanduicheLanchoneteJP();
			else if(nome.equalsIgnoreCase("LanchoneteRT"))
				return new SanduicheLanchoneteRT();
			else
				return null;

		}
}
