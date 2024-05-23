package exe2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TesteMap {

	public static void main(String[] args) {
		
		Map<String, Empregado> map = new HashMap<String, Empregado>();
		
		Empregado e1 = new Empregado ("a1234", "Steve Jobs", "Empres�rio", 28888888.00);
		Empregado e2 = new Empregado ("a1235", "Scott McNealy", "Empres�rio", 2887778.00);
		Empregado e3 = new Empregado ("a1236", "Jeff Bezos", "Empres�rio", 9555888.00);
		Empregado e4 = new Empregado ("a1237", "Larry Ellison", "Empres�rio", 66558888.00);
		Empregado e5 = new Empregado ("a1238", "Bill Gates", "Empres�rio", 5558888.00);
		
		map.put(e1.getID(), e1);
		map.put(e2.getID(), e2);
		map.put(e3.getID(), e3);
		map.put(e4.getID(), e4);
		map.put(e5.getID(), e5);
		
		Set<String> chaves = map.keySet();
		for(String chave: chaves) {
			System.out.println(map.get(chave));
		}
		
		busca("A1238", map);

	}
	
	
	
	
	public static void busca(String id,Map<String, Empregado> mapaaa) {
		
		String ide = id.toLowerCase();
		if (mapaaa.containsKey(ide)) {
            System.out.println(mapaaa.get(ide));
           }else{
                  System.out.println("Chave n�o existe");
           }
		}
	
}
