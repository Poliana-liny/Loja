package loja;

public class Main {

	public static void main(String[] args) {
		Produto p1 = new Produto("Base Matte Perfection", "30ml, Alta cobertura, Acabamento matte", 59.99);
		Produto p2 = new Produto("Máscara de Cílios Mega Volume", "8ml, Volume intenso, Resistente à água", 34.99);
		Produto p3 = new Produto("Batom Líquido Longa Duração", "5ml, Cor intensa, Efeito matte", 29.99);
		Produto p4 = new Produto("Paleta de Sombras Natural Glow", "12 cores, Pigmentação alta, Acabamento acetinado", 69.99);
		Produto p5 = new Produto("Hidratante Facial Diário", "50ml, Hidratação intensa, Para todos os tipos de pele", 49.99);
		Produto p6 = new Produto("Sérum Anti-Idade Revitalizante", "30ml, Reduz linhas finas, Com vitamina C", 89.99);
		Produto p7 = new Produto("Protetor Solar Facial FPS 50+", "50ml, Alta proteção, Toque seco", 74.99);
		Produto p8 = new Produto("Shampoo Reconstrução Capilar", "300ml, Fortalece os fios, Com queratina", 24.99);
		Produto p9 = new Produto("Condicionador Nutritivo", "300ml, Hidratação profunda, Com óleo de argan", 26.99);
		Produto p10 = new Produto("Esfoliante Corporal Renovador", "200g, Remove células mortas, Com partículas de açúcar", 34.99);
		Produto p11 = new Produto("Creme para Mãos Hidratante", "50ml, Toque sedoso, Com manteiga de karité", 19.99);
		Produto p12 = new Produto("Óleo Corporal Perfumado", "100ml, Hidratação intensa, Fragrância floral", 39.99);
		Produto p13 = new Produto("Pó Compacto Translúcido", "10g, Controla oleosidade, Acabamento natural", 27.99);
		Produto p14 = new Produto("Lápis de Olho à Prova D'Água", "1.2g, Traço preciso, Longa duração", 19.99);
		Produto p15 = new Produto("Blush Compacto Rosado", "8g, Cor natural, Acabamento suave", 24.99);
		Produto p16 = new Produto("Delineador Líquido Preto", "2.5ml, Traço fino, Resistente à água", 22.99);
		Produto p17 = new Produto("Primer Facial Uniformizador", "30ml, Minimiza poros, Prolonga a maquiagem", 54.99);
		Produto p18 = new Produto("Pincel Kabuki para Base", "Cerdas sintéticas, Aplicação uniforme, Cabo ergonômico", 29.99);
		Produto p19 = new Produto("Balm Labial Hidratante", "4g, Hidratação intensa, Com manteiga de cacau", 12.99);
		Produto p20 = new Produto("Desodorante Corporal Spray", "150ml, Proteção 24h, Fragrância fresca", 18.99);

		Carrinho c = new Carrinho();
		c.adicionar(p1);
		c.adicionar(p2);
		c.remover("Base Matte Perfection");
		
		Vendas v = new Vendas(c);
		v.totalpreco();
		
	}

}
