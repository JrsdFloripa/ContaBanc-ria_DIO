

public class ContaCorrente extends Conta{


	public ContaCorrente(String nome, String telefone) {
		super(nome, telefone);
	
	}

	public void imprimirExtrato() {
		System.out.println("=====Extrato conta corrente==========");
		super.imprimirRelatório();
	}

	@Override
	public void depositar() {
		
	}

		
		
}

		

