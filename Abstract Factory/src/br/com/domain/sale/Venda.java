package br.com.domain.sale;

import br.com.domain.bankslip.Boleto;
import br.com.domain.model.Produto;
import br.com.domain.nfe.NFE;

public class Venda {
	
	private NFE notaFiscal;
	private Boleto boleto;
	
	public Venda(VendaFactory factory) {
		this.notaFiscal = factory.criarNFE();
		this.boleto = factory.criarBoleto();		
	}
	
	public void realizarVenda(Produto produto) {
		double imposto = notaFiscal.calcularImposto(produto);
		boleto.emitir(produto, imposto);	
	}

}
