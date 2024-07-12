package edu.allan.contas;

public class Cliente {
	private String nome;
	private Banco banco;
	
	Cliente( Banco banco, String nome ) {
		this.banco = banco;		
		this.nome = nome;	
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getBanco() {
		return this.banco.getNome();
	}

}
