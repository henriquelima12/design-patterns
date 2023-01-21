package br.com.domain.sale;

import br.com.domain.bankslip.Boleto;
import br.com.domain.nfe.NFE;

public interface VendaFactory {
	
	public NFE criarNFE();
	public Boleto criarBoleto();
	
}
