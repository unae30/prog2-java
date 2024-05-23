package exe3;

public abstract class Dispositivo{
	private String nome;
	private long capacidadeEmBytes;
	
	public Dispositivo(String n, long c) {
		this.nome = n;
		this.capacidadeEmBytes = c;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCapacidadeEmBytes() {
		return capacidadeEmBytes;
	}


	public void setCapacidadeEmBytes(long capacidadeEmBytes) {
		this.capacidadeEmBytes = capacidadeEmBytes;
	}


	public abstract String toString();
	public abstract double capacidadeEmMegabytes();
	
}