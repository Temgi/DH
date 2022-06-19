package br.com.digitalhouse.thebookclub.enums;

public enum TipoPagamento {
	
	CREDITO(0),
	DEBITO(1),
	PIX(2),
	BOLETO(3),
	TRANSFERBANCARIA(4);
	
	private int valor;
	
	private TipoPagamento(int valor){
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
	
	public static TipoPagamento valueOf(int valor){
		for(TipoPagamento value : TipoPagamento.values() ){
			if(valor == value.getValor()){
				return value;
			}
		}
		throw new IllegalArgumentException("Tipo de Pagamento Inválido");
	}
}