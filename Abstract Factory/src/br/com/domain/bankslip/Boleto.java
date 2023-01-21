package br.com.domain.bankslip;

import br.com.domain.model.Produto;

public interface Boleto {
	
	public void emitir(Produto produto, double imposto);

}
