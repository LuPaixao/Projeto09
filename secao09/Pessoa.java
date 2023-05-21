//Classes
//Atributos
//Métodos
//Construtores
/*
 - Sempre um construtor vazio tem a seguinte forma:
 public NomeDaClasse(){}
 */
package br.com.geekuniversity.secao09;
public class Pessoa {
	String nome, email;
	int ano_nascimento;
	
	//Construtor vazio
	public Pessoa() {}
	
	//Construtor com parâmetros
	public Pessoa(String nome, String email, int ano_nascimento) {
		//this == Este obj
		this.nome = nome;
		this.email = email;
		this.ano_nascimento = ano_nascimento;
	}
	
	void imprimi_informacoes() {
		
		System.out.println(this.nome);
		System.out.println(this.email);
		System.out.println(this.ano_nascimento);
	}
}
