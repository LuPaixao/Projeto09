//Construtor
/*
 - O construtor da classe SEMPRE tem o mesmo nome da classe;
 - Por padrão a JVM - Java Virtual Machine, cria em tempo de execução
 um construtor padrão (um construtor vazio ());
 - Podemos ter mais de um construtor na classe
 -
 */
package br.com.geekuniversity.secao09;

public class Programa23 {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(); //Construtor
		
		pessoa1.nome = "Jones Zahir";
		pessoa1.email = "jones.@gmail.com";
		pessoa1.ano_nascimento = 2003;
		
		/*
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.email);
		System.out.println(pessoa1.ano_nascimento);
		*/
		pessoa1.imprimi_informacoes();
		
		Pessoa pessoa2 = new Pessoa("Angelina Jolie", "agelina@gmail.com", 1978);
		pessoa2.imprimi_informacoes();
		

	}

}
