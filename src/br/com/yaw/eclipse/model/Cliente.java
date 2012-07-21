package br.com.yaw.eclipse.model;


public class Cliente extends Pessoa {
	
	/*
	 * 1 - Crie os metodos get / set desse atributo, utilizando:
	 *     Ctrl + espaço
	 *     Ctrl + 3
	 *     Alt + Shift + S + R
	 */
	private String cartao;
	
	/*
	 * 2 - Renomeie o atributo cartao para cartaoCredito, com o atalho:
	 *     Alt + Shift + R
	 */

	public Cliente(String nome, String cpf) {
		super(nome, cpf);
	}
	
}
