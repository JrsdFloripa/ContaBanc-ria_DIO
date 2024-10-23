

public class ContaPoupança extends Conta{

	public ContaPoupança(String nome, String telefone) {
		super(nome, telefone);
		
	}

	public void imprimirExtrato() {
		System.out.println("=====Extrato conta poupança==========");	
		super.imprimirRelatório();	
	}

	@Override
	public void depositar() {
		
		
	}

	
	

}
