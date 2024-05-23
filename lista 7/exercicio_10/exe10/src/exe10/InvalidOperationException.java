package exe10;

//voltei para o Exception, mas fiz o teste com o RunTimeException, retirando o tratamento de exceções
public class InvalidOperationException extends Exception{
	
	private String mensagem;
	
	public InvalidOperationException (String msg) {
		this.mensagem = msg;
	}
	
	public String getMensagem() {
		return this.mensagem;
	}
	
}
