package exe9;

import java.io.FileInputStream;

public class TesteException {
	
	public void someMethod() throws Exception{
			someMethod2(); 
			FileInputStream f = new FileInputStream("Opa, testando");
			f.close();
			
	}
	
	public void someMethod2() throws Exception{
			FileInputStream f = new FileInputStream("Opa, testando");
			f.close();
	}
}
