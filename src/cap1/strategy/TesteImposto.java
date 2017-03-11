package cap1.strategy;

public class TesteImposto {

	public static void main(String[] args) {

		Imposto icms = new ICMS();
		Imposto iss = new ISS();
		Imposto iccc = new ICCC();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadorImposto calculadorImposto = new CalculadorImposto();
		
		calculadorImposto.realizaCalculo(orcamento, icms);
		calculadorImposto.realizaCalculo(orcamento, iss);
		calculadorImposto.realizaCalculo(orcamento, iccc);
	}

}
