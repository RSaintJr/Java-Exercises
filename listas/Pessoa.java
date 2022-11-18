package com.curvello.listas;

import java.text.ParseException;
import java.util.Date;

public class Pessoa {
	
	private String nome;
	private String email;
	private Date nascimento;

	public Pessoa(String nome, String email, Date nascimento) throws ParseException {
		this.nome = nome;
		this.email = email;
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public int idad(){
		Date hoje = new Date();

		int idad = hoje.getYear() - nascimento.getYear();

		if (hoje.getMonth() < nascimento.getMonth() || hoje.getMonth() == nascimento.getMonth() && hoje.getDay() < nascimento.getDay())
		{
			idad--;
		}

		return idad;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Pessoa{");
		sb.append("nome='").append(nome).append('\'');
		sb.append(", email='").append(email).append('\'');
		sb.append(", nascimento=").append(nascimento);
		sb.append('}');
		return sb.toString();
	}
}
