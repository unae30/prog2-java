package letrab;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Controlador {

	public static void main(String[] args) {
		
		Set<Produtos> produtos = new HashSet<Produtos>();
		
		Scanner sc1 = new Scanner(System.in);
		
		int aux;
		
		do {
			
			System.out.println("----------------MENU-----------------");
			System.out.println("- 1: Cadastrar Produtos             -");
			System.out.println("- 2: Mostrar Produtos Cadastrados   -");
			System.out.println("- 3: Sair                           -");
			System.out.println("-------------------------------------");
			
			String auxString = sc1.nextLine();
			aux = Integer.parseInt(auxString);
			switch(aux) {
		
			case 1:
				System.out.println("Cadastro de produtos: ");
				System.out.println("ID: ");
				String id = sc1.nextLine();
				System.out.println("Nome: ");
				String nome = sc1.nextLine();
				System.out.println("Preço: ");
				String preco = sc1.nextLine();
				double precoReal = Double.parseDouble(preco);
			
				Produtos produtoCadastrado = new Produtos (id, nome, precoReal);
				if(!produtos.contains(produtoCadastrado)) {
					produtos.add(produtoCadastrado);
				}
				else {
					System.out.println("Este produto ja foi cadastrado anteriormente.");				
				}
				break;
			case 2:
				for(Produtos produtosImpressos: produtos) {
					System.out.println(produtosImpressos);
				}
				break;
			case 3: 
				break;
			default: 
				System.out.println("Opção de menu inválida.");
			}
		}while(aux != 3);
	}
}
