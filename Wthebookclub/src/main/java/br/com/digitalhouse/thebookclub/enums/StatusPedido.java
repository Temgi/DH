package br.com.digitalhouse.thebookclub.enums;

public enum StatusPedido {
	
	AGUARDANDO_PAGAMENTO(0),
	PAGO(1),
	PROCESSANDO(2),
	DESPACHADO(3),
	ENTREGUE(4),
	CANCELADO(5); 
	
	private int valor;
	
	private StatusPedido(int valor){
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
	
	public static StatusPedido valueOf(int valor){
		for(StatusPedido value : StatusPedido.values() ){
			if(valor == value.getValor()){
				return value;
			}
		}
		throw new IllegalArgumentException("Status do Pedido Inválido");
	}
}