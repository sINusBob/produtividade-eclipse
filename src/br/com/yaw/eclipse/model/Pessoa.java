package br.com.yaw.eclipse.model;

/*
 * 1 - Navegue até a linha 37 do código com o atalho:
 *     Ctrl + L
 *     
 * 2 - Utilize o Outline para navegar nos métodos da classe:
 *     Ctrl + O
 *     
 * 3 - Utilize a funcionalidade Incremental Find para pesquisar pelo método compareTo:
 *     Ctrl + J + compareTo
 */

public class Pessoa implements Comparable<Pessoa> {

	private String nome;
	
	private String cpf;
	
	public Pessoa(){
		super();
	}
	
	public Pessoa(String nome, String cpf) {
		setNome(nome);
		setCpf(cpf);
	}
	
	/*
	 * 4 - Verifique aonde esse método é utilizado: Ctrl + Shift + G
	 */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public int compareTo(Pessoa o) {
		return this.nome.compareTo(o.nome);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		
		if (obj == this)
			return true;
		
		if (!obj.getClass().equals(Cliente.class))
			return false;
		
		if ("".equals(nome == null ? "" : nome))
			return false;
		
		Pessoa outro = (Pessoa) obj;
		return nome.equals(outro.nome);
	}
	
	@Override
	public int hashCode() {
		return nome.hashCode();
	}
}
