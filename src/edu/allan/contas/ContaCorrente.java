package edu.allan.contas;

public class ContaCorrente extends Conta {
	public ContaCorrente( Cliente cliente, Banco banco ) {
		super(cliente, banco);
		
		banco.contas.add(this);
	}
	
	
	@Override
	public void imprimirExtrato() {		
		System.out.println("Extrato Conta Corrente");
		super.imprimirInformacoesComuns();		
	}	
}
