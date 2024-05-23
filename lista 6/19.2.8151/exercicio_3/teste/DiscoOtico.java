package exe3;


public class DiscoOtico extends Dispositivo {
	
//	private static final String nome = "Disco Tico";
//	private static final long capacidadeEmBytes = 241173480L;

	public DiscoOtico() {
		super("Disco tico", 241172480L);
	}
	
	@Override
	public String toString() {
		return "Dispositivo: " + this.getNome() + "Capacidade: " + this.getCapacidadeEmBytes();
	}

	@Override
	public double capacidadeEmMegabytes() {
		double kilobytes = this.getCapacidadeEmBytes() / 1024;
		double megabytes = kilobytes / 1024;
		return megabytes;
	}

}
