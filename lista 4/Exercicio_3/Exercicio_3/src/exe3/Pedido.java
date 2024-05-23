package exe3;

public class Pedido {
	private float valor_total;
	private ItemPedido [] item_pedido;


	public Pedido(int tamanho) {

		this.item_pedido = new ItemPedido [tamanho];
		
	}

	public float getValor_total() {
		return valor_total;
	}

	public void setValor_total(float valor_total) {
		this.valor_total = valor_total;
	}
	
	public ItemPedido [] getItem_pedido() {
		return item_pedido;
	}
	public void setItem_pedido(ItemPedido [] item_pedido) {
		this.item_pedido = item_pedido;
	}
	
//	public int getTamanho() {
//		return tamanho;
//	}
//
//	public void setTamanho(int tamanho) {
//		this.tamanho = tamanho;
//	}
	
	public void adicionar_item(ItemPedido item_pedido) {
		int id = 0;
			for(int i = 0; i < this.item_pedido.length; i++) {
				if(id == 0) {
					if(this.item_pedido[i] == null) {
						this.item_pedido[i] = item_pedido;	
							id = 1;
					}
				}
			}
	}
	
	public float obter_total() {
		valor_total = 0;
			for(int i = 0; i < item_pedido.length; i++) {
				if(item_pedido[i]!= null) {
						float aux =	item_pedido[i].getProduto().getValor() * item_pedido[i].getQuantidade();
						valor_total += aux;			
				}
			}
		return this.valor_total;
	}

}
