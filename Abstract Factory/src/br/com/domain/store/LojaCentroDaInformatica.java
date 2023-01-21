package br.com.domain.store;

import br.com.domain.bankslip.Boleto;
import br.com.domain.bankslip.BoletoBancoDoBrasil;
import br.com.domain.nfe.NFE;
import br.com.domain.nfe.NFESaoPaulo;
import br.com.domain.sale.VendaFactory;

public class LojaCentroDaInformatica implements VendaFactory{

	@Override
	public NFE criarNFE() {
		NFE notaFiscal = new NFESaoPaulo();
		return notaFiscal;
	}

	@Override
	public Boleto criarBoleto() {
		Boleto boleto = new BoletoBancoDoBrasil();
		return boleto;	
	}

}
