package lanchonete;

public class TesteLanchonete {

	public static void main(String[] args) {
		
		Sanduiches lanche = new Sanduiches("LanchoneteJP");
		ISanduiches ilanche = lanche.getSanduiche();
		ilanche.ingredientes();
		
	}

}
