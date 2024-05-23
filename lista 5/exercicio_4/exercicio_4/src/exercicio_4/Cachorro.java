package exercicio_4;

public class Cachorro extends Animal{
	
	private String latir;
	
	//construtores
	public Cachorro () {
		super();
	}
	
	public Cachorro (String nome) {
		super(nome);
	}
	
	//getters e setters
	
	public String getLatir() {
		return latir;
	}

	public void setLatir(String latir) {
		this.latir = latir;
	}
	
	//metodo latir
	
	public String late() {
		if(super.getNome() == null) {
			this.latir = "AUAUAUAUAU";
			System.out.println("Pega tiu");
			return latir;
		}
		else {
			this.latir = "AUAUAUAUAU";
			System.out.println("Pega " + super.getNome());
			return latir;
		}
	}
}
