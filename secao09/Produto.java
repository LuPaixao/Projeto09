//Classes
/*
 - Classe java não tem método main, programas java sim
 - Toda classe java possui a seguinet forma: 
 - public class NomeDaClasse{}
 - tudo que estiver dentro das chaves das classes, faz parte da classe
*/

//Atributos
/*
 - Características da classe/molde
 - Atributos são (variáveis) da classe, ou (estados)
 - Atrbutos são nomeados em letra minúsculas
*/

//Métodos
/*
 - Podemos entender métodos como a ação que é realizada por um obg da classe
 - Podemos entender que os métodos são comportamentos dos obg da classe
 - Mesmo requisitos p/ funções
     a) o tipo de retorno; (tipo de dado q a função retornar)
	 b) nome; (corresponde a função que realiza)
	 c) parametros de entrada/argumentos (opcn)
	 d) retorno (opcn)
*/
package br.com.geekuniversity.secao09;

public class Produto {
	
	String nome;
	float preco, desconto;
	
	//Método p/ aumentar o preço do prod. em 10
	//void não é necessário o retorno
	void aumentar_preco() {
		this.preco = this.preco + 10;
	}
	
}
