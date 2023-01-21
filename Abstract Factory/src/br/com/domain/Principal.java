package br.com.domain;

import java.math.BigDecimal;

import br.com.domain.model.Produto;
import br.com.domain.sale.Venda;
import br.com.domain.sale.VendaFactory;
import br.com.domain.store.LojaCentroDaInformatica;

public class Principal {
	
	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.setNome("Smartphone Moto X 2° geração");
		produto.setQuantidade(1);
		produto.setValorUnitario(new BigDecimal(1000));
		
		VendaFactory factory = new LojaCentroDaInformatica();
		
		Venda venda = new Venda(factory);
		
		venda.realizarVenda(produto);	
	}

}
