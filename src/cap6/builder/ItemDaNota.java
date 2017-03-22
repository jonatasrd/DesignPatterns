package cap6.builder;

public class ItemDaNota {

	private String descricao;
	private double valor;

	public ItemDaNota(String descricao, double valor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Item: " + this.descricao + " com preço de " + this.valor;
	}
}
