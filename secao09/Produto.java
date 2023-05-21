//Classes
/*
 - Classe java n�o tem m�todo main, programas java sim
 - Toda classe java possui a seguinet forma: 
 - public class NomeDaClasse{}
 - tudo que estiver dentro das chaves das classes, faz parte da classe
*/

//Atributos
/*
 - Caracter�sticas da classe/molde
 - Atributos s�o (vari�veis) da classe, ou (estados)
 - Atrbutos s�o nomeados em letra min�sculas
*/

//M�todos
/*
 - Podemos entender m�todos como a a��o que � realizada por um obg da classe
 - Podemos entender que os m�todos s�o comportamentos dos obg da classe
 - Mesmo requisitos p/ fun��es
     a) o tipo de retorno; (tipo de dado q a fun��o retornar)
	 b) nome; (corresponde a fun��o que realiza)
	 c) parametros de entrada/argumentos (opcn)
	 d) retorno (opcn)
*/
package br.com.geekuniversity.secao09;

public class Produto {
	
	String nome;
	float preco, desconto;
	
	//M�todo p/ aumentar o pre�o do prod. em 10
	//void n�o � necess�rio o retorno
	void aumentar_preco() {
		this.preco = this.preco + 10;
	}
	
}
