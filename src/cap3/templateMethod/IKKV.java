package cap3.templateMethod;

import cap1.strategy.Orcamento;
import cap2.chainOfResponsability.Item;

public class IKKV extends TemplateDeImpostoCondicional{

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
	}

	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
        for(Item item : orcamento.getItens()) {
          if(item.getValor() > 100) return true;
        }

        return false;
      }

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
