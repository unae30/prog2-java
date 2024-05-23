package exercicio_4;

public class Gato extends Animal{
	
	private String miar;
	
	//construtores
	public Gato() {
		super();
	}
	
	public Gato(String nome) {
		super(nome);
	}
	
	//getters e setters

	public String getMiar() {
		return miar;
	}

	public void setMiar(String miar) {
		this.miar = miar;
	}
	
	//metodo miar
	
	public String mia(){
		if(super.getNome() == null) {
			this.miar = "MIAAAAU";
			System.out.println("mia gatinho");
			return miar;
		}
		else {
			this.miar = "MIAAAAU";
			System.out.println("Mia " + super.getNome());
			return miar;
		}
	}
	

}
