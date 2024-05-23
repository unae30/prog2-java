package exer5;
import java.util.Scanner;

public class Controlador {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		//CRIAÇÃO DO INGRESSO
		
		//INGRESSO
		Ingresso show = new Ingresso();
		show.setValor(100);
		//NORMAL
		Normal ingressoNormal = new Normal();
		ingressoNormal.setValor(show.getValor());
		//VIP
		VIP ingressoVIP = new VIP();
		ingressoVIP.setValor(show.getValor());
		ingressoVIP.setAdicional(50);
		//camarote inferior
		CamaroteInferior ingressoVIPInferior = new CamaroteInferior();
		ingressoVIPInferior.setValor(show.getValor());
		ingressoVIPInferior.setAdicional(ingressoVIP.getAdicional());
		//camarote superior
		CamaroteSuperior ingressoVIPSuperior = new CamaroteSuperior();
		ingressoVIPSuperior.setValor(show.getValor());
		ingressoVIPSuperior.setAdicional(ingressoVIP.getAdicional());
		ingressoVIPSuperior.setValorAdicional(50);
		
		
		
		
		
		
		
		
		System.out.println("----------- MENU ------------");
		System.out.println("-- ESCOLHA O SEU INGRESSO: --");
		System.out.println("--                         --");
		System.out.println("--                         --");
		System.out.println("-- 1: NORMAL               --");
		System.out.println("-- 2: VIP                  --");
		System.out.println("-----------------------------");
		
		int aux = sc.nextInt();
		
		switch (aux) {
		
			case 1:
				ingressoNormal.Imprime();
				ingressoNormal.imprimeValor();
				break;
			case 2:
				ingressoVIP.Imprime();
				System.out.println();
				System.out.println("----------- MENU ------------");
				System.out.println("--  ESCOLHA A LOCALIZAÇÃO: --");
				System.out.println("--                         --");
				System.out.println("--                         --");
				System.out.println("-- 1: CAMAROTE INFERIOR    --");
				System.out.println("-- 2: CAMAROTE SUPERIOR    --");
				System.out.println("-----------------------------");
			
				int aux2 = sc.nextInt();
			
				switch(aux2) {
					case 1:
						ingressoVIPInferior.imprimeVIPInf();
						System.out.println(ingressoVIPInferior.valorVIP());
						break;
					case 2:
						ingressoVIPSuperior.ImprimeVIPSup();
						System.out.println(ingressoVIPSuperior.valorCamaroteSuperior());
						break;
				}
				
				break;				
			}
	}

}
