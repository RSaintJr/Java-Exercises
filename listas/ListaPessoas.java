// incompleto

package com.curvello.listas;

import java.util.*;




public class ListaPessoas {
	
	private List<Pessoa> lista = new ArrayList<Pessoa>();
		
	public List<Pessoa> getLista() {
		return lista;
	}

	public void setLista(List<Pessoa> lista) {
		this.lista = lista;
	}

	public Pessoa Nome(String nome)
	{
		for (Pessoa pessoa : lista)
		{
			if (nome.equals(pessoa.getNome()))
			{
				return pessoa;
			}
		}

		return null;
	}

	public Set<String> dominio()
	{
		Set<String> set = new HashSet<String>();

		for (Pessoa pessoa : lista)
		{
			String emailP = pessoa.getEmail();
			int dominionC = emailP.indexOf("@") + 1;
			int dominionF = emailP.indexOf(".com");

			set.add(emailP.substring(dominionC, dominionF));
		}

		return set;
	}

	public List<Pessoa> buscaIdad(Date data)
	{
		List<Pessoa> pessoaBusca = new ArrayList<Pessoa>();
		for (Pessoa pessoa : lista) {
			 Date nascimento = pessoa.getNascimento();
			if (nascimento.getMonth() == data.getMonth() && nascimento.getYear() == nascimento.getYear()) {
				pessoaBusca.add(pessoa);
			}
		}

		return pessoaBusca;
	}

	public Set<Pessoa> busca(int idad) {
		Set<Pessoa> set = new HashSet<Pessoa>();

		for (Pessoa pessoa : lista) {
			if (pessoa.idad() == idad) {
				set.add(pessoa);
			}
		}

		return set;
	}

	public boolean Rnome(String nome) {
		for (Pessoa pessoa : lista) {
			if (nome.equals(pessoa.getNome())) {
				lista.remove(pessoa);
				return true;
			}
		}

		return false;
	}

	public boolean add(Pessoa pessoa) {
		lista.add(pessoa);
		return true;
	}
	
	/*
	 * Não permitir nomes iguais
	 * Buscar todos os domínios de e-mail
	 * Remover pelo nome
	 * Alterar pessoa
	 * Fazer uma busca usando 'like' incial do nome
	 * 
	 */
	
	

}
