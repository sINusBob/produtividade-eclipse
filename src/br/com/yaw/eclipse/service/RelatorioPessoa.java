package br.com.yaw.eclipse.service;

import static java.lang.System.out;
import br.com.yaw.eclipse.model.Cliente;
import br.com.yaw.eclipse.model.Pessoa;

public class RelatorioPessoa {

	public void print(Pessoa p) {
		/*
		 * O trecho abaixo está repetido nos 2 métodos print.
		 * 1 - Para melhor a qualidade do código utilize a funcionalidade Extract Method:
		 *     Alt + Shift + M
		 */
		String dados = String.format("Nome: %1$s \tCpf: %2$s", p.getNome(), p.getCpf());
		out.println(dados);
	}
	
	public void print(Cliente c) {
		String dados = String.format("Nome: %1$s \tCpf: %2$s", c.getNome(), c.getCpf());
		/*
		 * Remova o comentario abaixo para utilizar o metodo getCartao
		 */
		//dados = dados.concat(String.format("\tCartao nro: %s", c.getCartao()));
		out.println(dados);
	}
	
	public static void main(String[] args) {
		Pessoa p = InnerFactory.novaPessoa();
		Cliente c = InnerFactory.novoCliente();
		
		RelatorioPessoa rel = new RelatorioPessoa();
		rel.print(p);
		rel.print(c);
	}
	
	/*
	 * 2 - Pesquisa essa inner class no Open Type:
	 *     Ctrl + Shift + T
	 */
	
	private static class InnerFactory{
		private InnerFactory(){}
		
		static Pessoa novaPessoa(){ 
			return new Pessoa("Joana","2332");
		}
		
		static Cliente novoCliente(){ 
			Cliente c = new Cliente("Carlos","5432");
			/*
			 * Remova o comentario abaixo para utilizar o metodo getCartao
			 */
			//c.setCartao("21313-X11");
			return c;
		}
	}
	
}
