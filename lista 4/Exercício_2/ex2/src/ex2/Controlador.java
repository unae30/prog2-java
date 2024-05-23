package ex2;

public class Controlador {

	public static void main(String[] args) {
		Universidade u1 = new Universidade("UFOP");
		Universidade u2 = new Universidade("UEMG");
		Universidade u3 = new Universidade("UFV");
		
		Departamento d1 = new Departamento(u1,"DESCI");
		Departamento d2 = new Departamento(u1,"DEENP");
		Departamento d4 = new Departamento(u1,"DEELT");
		
		Departamento d3 = new Departamento(u2, "ICEB");
		Departamento d5 = new Departamento(u2, "DEAMB");
		Departamento d6 = new Departamento(u2, "DESSO");
		
		Departamento d7 = new Departamento(u3, "DECGP");
		Departamento d8 = new Departamento(u3, "DECPA");
		Departamento d9 = new Departamento(u3, "DEMSC");
		//poderiamos criar 50 departamentos para cada univerisade criada.
		
		Pessoa p1 = new Pessoa ("Unaê", "30/01/1998");
		
		p1.setDepartamento(d1);
		
		System.out.println(p1.getNome() + " estuda no departamento " + p1.getDepartamento().getNome() + " da instituição de ensino " + p1.getDepartamento().getUniversidade().getNome());
	}

}
