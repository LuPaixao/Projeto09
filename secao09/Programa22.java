//Objetos
/*
 - São produtos/intâncias da classe;
 -
 */

package br.com.geekuniversity.secao09;

public class Programa22 {

	public static void main(String[] args) {
		int numero = 4;
		
		//Declaração de um obejto
		Produto p0;
		
		//Declaração e intanciação/iniciação do objeto
		//p1 -> instância do objeto
		Produto p1 = new Produto(); //Construtor
		p1.nome = "Notebook";
		p1.preco = 2.607f;
		p1.desconto = 15.0f;
		
		System.out.println("==========Produtos==========");
		System.out.println(p1.nome);
		System.out.println("R$" + p1.preco);
		System.out.println(p1.desconto + "%");
		
		p0 = new Produto(); //Construtor
		p0.nome = "Caneta Bic";
		p0.preco = 2.45f;
		p0.desconto = 5;
		
		System.out.println(p0.nome);
		System.out.println("R$" + p0.preco);
		System.out.println(p0.desconto + "%\n");
		
		Pessoa pessoa1 = new Pessoa(); //Construtor
		pessoa1.nome = "Angelina Borges";
		pessoa1.email = "Borges.@gmail.com";
		pessoa1.ano_nascimento = 1978;
		
		System.out.println("==========Pessoas==========");
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.email);
		System.out.println(pessoa1.ano_nascimento);

	}

}
