


public interface Banco {
	
	void sacar(double valor);
    void depositar();
	void transferir(double valor, Conta contaDestino);
	void imprimirExtrato();

}
