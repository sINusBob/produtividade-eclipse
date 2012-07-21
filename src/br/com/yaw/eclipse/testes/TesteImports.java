package br.com.yaw.eclipse.testes;

import java.io.*;

import java.util.Set;

import java.util.*;

import static java.lang.System.*;

import br.com.yaw.eclipse.model.Cliente;

import br.com.yaw.eclipse.model.Pessoa;

import java.util.List;

/*
 * 1 - Organize a estrutura de imports dessa classe.
 *     Dica, utilize o atalho: Ctrl + Shift + O
 */

public class TesteImports {

	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<>();
		
		clientes.add(new Cliente("Claudio", "111"));
		clientes.add(new Cliente("Mariana", "222"));
		clientes.add(new Cliente("Pedro", "020"));
		
		for (Cliente cliente : clientes) {
			out.println(cliente.getNome());
		}
		
		FileInputStream file = null;
		
		/*
		 * 2 - Remova o comentário abaixo, crie o try-catch com o atalho:
		 *     Alt + Shift + Z
		 */
		//file = new FileInputStream("/home/eder/teste.txt");
		
	}
	
}
