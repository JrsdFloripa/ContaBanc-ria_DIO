

public abstract class Conta implements Banco{
	private static final int AGENCIA_PADRAO = 001;
	private static int SEQUENCIAL = 1;
	
	private int numero;
	private double saldo;
	private int agencia;
	private Cliente cliente;
	
	public Conta(String nome, String telefone) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL ++;
		this.saldo = getSaldo();
		this.cliente = cliente;
	}
	
	
	public void sacar(double valor) {
		saldo = saldo - valor;
		
	}
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public void imprimirRelatório() {
		System.out.println("Agência: " + getAgencia());	
		System.out.println("Titular da conta: " + cliente);
		System.out.println("Numero da conta: " + getnumero());	
		System.out.println("Saldo da conta: " + getSaldo());
		System.out.println("===========FIM==============");
	}
		   
	public double getSaldo() {
		return saldo;
	}
	public int getnumero() {
		return numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	
}