// imcompleto

package com.curvello.listas;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		ListaPessoas l = new ListaPessoas();

		Pessoa p = new Pessoa("Rodrigo", "lindinho@gmail.com", new Date(9/3/2004));

		l.add(p);

		p = new Pessoa("Tereza", "tereza@outlook.com",new Date(19/06/1998));

		l.add(p);

		for (String dominion : l.dominio())
		{
			System.out.println(dominion);
		}

		l.Rnome("Rodrigo");
		for (Pessoa item: l.getLista())
		{
			System.out.println(item.toString());
		}

		p = l.Nome("Tereza");
		p.setNome("Terezinha");
		System.out.println(p);

		Date agoga = p.getNascimento();
		List<Pessoa> buscape = l.buscaIdad(agoga);
		System.out.println(buscape);

		List<Pessoa> lista = l.getLista();

		for (Pessoa item : lista) {
			System.out.println(item.toString());
		}

	}

}
