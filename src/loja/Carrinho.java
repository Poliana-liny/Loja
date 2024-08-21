package loja;

import java.util.ArrayList;

public class Carrinho {
	ArrayList<Produto> produtos;
	
	public Carrinho() {
		this.produtos = new ArrayList<>();
	}
	
	public void adicionar(Produto p) {
		produtos.add(p);
		System.out.println("Produto "+p.getNome()+" foi adicionado ao carrinho!");
	}
	
	public void remover(String nome) {
		int codigo = -1;
		System.out.println(produtos.size());
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getNome().equals(nome)) {
				codigo = i;
				produtos.remove(codigo);
				break;
			} else {
				continue;
			}
		}
		if (codigo == -1) {
			System.out.println("O produto não foi encontrado");
	}else {
		System.out.println("O produto "+nome+" foi removido com sucesso!");
	}
	
	} 
	public ArrayList<Produto> getprodutos(){
		return produtos;
		
	}

}
