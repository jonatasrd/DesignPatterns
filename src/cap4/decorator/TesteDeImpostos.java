package cap4.decorator;

public class TesteDeImpostos {
	public static void main(String[] args) {
        Imposto impostos = new ISS(new ICMS());

        Orcamento orcamento = new Orcamento(500.0);

        System.out.println(impostos.calcula(orcamento));
        
        Orcamento casa = new Orcamento(4000);
        
        Imposto impostosCasa = new ImpostoMuitoAlto(new ICMS());
        
        System.out.println("Impostos casa: " + impostosCasa.calcula(casa));
    }
}
