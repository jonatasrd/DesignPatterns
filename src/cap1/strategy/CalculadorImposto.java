package cap1.strategy;

public class CalculadorImposto {
	
	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {

        double valor = imposto.calcula(orcamento); 

        System.out.println(valor);

      }
}
