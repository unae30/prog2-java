package exe9;

public class Main {

	public static void main(String[] args) {
		
		TesteException tst = new TesteException();
		try {
			tst.someMethod();
		}catch(Exception e) {
			System.out.println("Error");
			Thread.dumpStack();
		}

	}

}
