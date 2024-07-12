package edu.allan.contas;

public class ContaPoupanca extends Conta {
	public ContaPoupanca( Cliente cliente, Banco banco ) {
		super(cliente, banco);
		banco.contas.add(this);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato Conta Poupanca");
		super.imprimirInformacoesComuns();		
	}
}
