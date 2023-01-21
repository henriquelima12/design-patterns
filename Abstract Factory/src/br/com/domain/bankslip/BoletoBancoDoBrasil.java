package br.com.domain.bankslip;

import br.com.domain.model.Produto;

public class BoletoBancoDoBrasil implements Boleto {

	@Override
	public void emitir(Produto produto, double imposto) {
		System.out.println("BANCO DO BRASIL");
		System.out.println("==========================================================");
		System.out.println("Descrição: " +produto.getNome());
		System.out.println("Quantidade: " +produto.getQuantidade());
		System.out.println("Valor: R$ " +produto.getValorUnitario());
		System.out.println("Imposto: " +imposto);
		System.out.println("Valor total: " +produto.getValorTotal(imposto));
	}

}
