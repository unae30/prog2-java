package exe3;

public class Controlador {

	public static void main(String[] args) {
		
		Produto p1 = new Produto(001, 20, "Sabonete");
		Produto p2 = new Produto(002, 30, "Shampoo");
		Produto p3 = new Produto(0001, 10, "Condicionador");
		
		ItemPedido i1 = new ItemPedido(2, p1);
		ItemPedido i2 = new ItemPedido(3, p2);
		ItemPedido i3 = new ItemPedido(1, p3);
		
		Pedido ped1 = new Pedido(3);
		
		ped1.adicionar_item(i1);
		ped1.adicionar_item(i2);
		ped1.adicionar_item(i3);

		
		ped1.obter_total();
		System.out.println(ped1.getValor_total());
	}

}
