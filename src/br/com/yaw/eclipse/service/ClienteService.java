package br.com.yaw.eclipse.service;

import br.com.yaw.eclipse.model.Cliente;

/*
 * 1 - Verifique qual classe implementa essa interface:
 *     F4 
 */

public interface ClienteService {

	void persiste(Cliente c);
	
	void remove(Cliente c);
	
	Cliente findByNome(String nome);
}
