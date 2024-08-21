package loja;

import java.util.ArrayList;

public class Vendas {
	Carrinho carrinho;
	
	public Vendas(Carrinho carrinho) {
		this.carrinho = carrinho;
	}
	
	public void totalpreco(){
		ArrayList<Produto> p = carrinho.getprodutos();
		double total = 0;
		for (int i=0; i<p.size(); i++) {
			total += p.get(i).getPreco();
		}
		System.out.println("O total da compra foi R$: "+total);    
	}
}
