package edu.allan.contas;

public class Main {

    public static void main( String[] args ) {
		Banco banco = new Banco("Banco Nacional");
		
		Cliente anna = new Cliente( banco, "Anna" );
		
		Conta cc = new ContaCorrente(anna, banco);	
		cc.depositar(100);
		
		System.out.println( anna.getBanco() );
		
		// cc.imprimirExtrato();		
		
		Conta poupanca = new ContaPoupanca(anna, banco);
		// poupanca.imprimirExtrato();
		
		cc.transferir(50, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		Cliente john = new Cliente( banco, "John");
		Conta ccJohn = new ContaCorrente(john, banco);
		
		System.out.println(banco.getContas());
	}
    
}
