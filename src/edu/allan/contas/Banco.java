package edu.allan.contas;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	protected List<Conta> contas;
	
	Banco( String nome ) {
		this.nome = nome;
		this.contas = new ArrayList<>();
	}
	
	public void addContas( Conta conta ) {
		this.contas.add(conta);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public List<Conta> getContas() {
		return this.contas;
	}

}
