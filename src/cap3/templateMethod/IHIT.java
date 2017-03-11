package cap3.templateMethod;

import java.util.ArrayList;
import java.util.List;

import cap1.strategy.Orcamento;
import cap2.chainOfResponsability.Item;

public class IHIT extends TemplateDeImpostoCondicional{

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		List<String> noOrcamento = new ArrayList<String>();
		for (Item item : orcamento.getItens()) {
			if (noOrcamento.contains(item.getNome())){
				return true;
			}else{
				noOrcamento.add(item.getNome());
			}
		}
		return false;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (0.01 * orcamento.getItens().size());
	}

}
