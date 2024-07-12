package edu.allan.contas;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA = 4545;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;	
	protected Banco banco;
	
	Conta(Cliente cliente, Banco banco) {
		this.agencia = AGENCIA;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.banco = banco;
	}
	
	public void sacar( double valor ) {
		this.saldo -= valor;
		
	}
	
	public void depositar( double valor ) {
		this.saldo += valor;		
	}
	
	public void transferir( double valor, Conta destino ) {
		this.sacar(valor);
		destino.depositar(valor);		
	}
	
	protected void imprimirInformacoesComuns() {
		System.out.printf("Titular: %s%n", this.cliente.getNome());
		System.out.printf("Agencia: %d%n", this.agencia);
		System.out.printf("Numero: %d%n", this.numero);
		System.out.printf("Saldo: %.2f%n", this.saldo);
	}
	
	public String toString() {
		return String.format(
				"Titular: %s, Agencia: %d, Numero: %d%n", 
				this.cliente.getNome(),
				this.agencia,
				this.numero);
				
	}

}
