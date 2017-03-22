package cap6.builder;

public class TesteNotaFiscalBuilder {

	public static void main(String[] args) {

		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.paraEmpresa("Jonatas Negocios SA").comCnpj("8999.090.000/0098").com(new ItemDaNota("item 2", 50.0))
				.com(new ItemDaNota("item 1", 90.0)).comObservacoes("cadastrando uma nota fiscal com builder").naDataAtual();

		NotaFiscal nf = builder.constroi();

		System.out.println(nf.getItens());

	}
}
