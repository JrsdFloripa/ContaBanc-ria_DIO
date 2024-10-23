

public class Main {

	public static void main(String[] args) {
		
	  Conta cc = new ContaCorrente(null, null);
	  cc.depositar(100);
	  cc.depositar(400);
	  Conta poupança = new ContaPoupança(null, null);
	  poupança.depositar(300);
	  Conta cp = new ContaPoupança(null, null);
	  cp.depositar(1000);
	  cp.transferir(200, poupança);
	  cc.imprimirExtrato();
	  poupança.imprimirExtrato();
	  cp.imprimirExtrato();
	  
	  
	}
	
}
