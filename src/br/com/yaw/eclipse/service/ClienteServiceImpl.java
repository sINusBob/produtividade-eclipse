package br.com.yaw.eclipse.service;

import java.util.LinkedList;

import br.com.yaw.eclipse.model.Cliente;

/*
 * Dicas para facilitar a navegação das classes:
 *   - Utilize a opção 'Link with Editor', no menu superior do Package Explorer;
 *   - Ctrl + E : exibe um popup com as classes abertas;
 *   - Ctrl + Q : acessa a última modificação;
 *   - Alt + ← : Utilize para voltar a navegação para o método anterior;
 *   - Ctrl + M : ampliar (ou voltar) a visão da classe;
 */

public class ClienteServiceImpl implements ClienteService{

	/*
	 * Visualize o Javadoc da classe LinkedList: F2
	 */
	private LinkedList<Cliente> clientes = new LinkedList<Cliente>();
	
	@Override
	public void persiste(Cliente c) {
		if (c != null) {
			clientes.add(c);
		}
	}

	@Override
	public void remove(Cliente c) {
		clientes.remove(c);
	}

	@Override
	public Cliente findByNome(String nome) {
		for (Cliente c: clientes) {
			if (c.getNome().equalsIgnoreCase(nome)){
				return c;
			}
		}
		return null;
	}
	
}
