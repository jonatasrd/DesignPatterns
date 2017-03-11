package cap2.chainOfResponsability;

public interface Desconto {
	double desconta(Orcamento orcamento);
	void setProximo(Desconto proximo);
}
