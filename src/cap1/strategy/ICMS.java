package cap1.strategy;

public class ICMS implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}
	
	

}
