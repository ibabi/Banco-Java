package bancoJava;
import java.util.Random;

public abstract class Conta {
	protected int agencia;
	protected int numero;
	protected float saldo;
	private Cliente cliente;
	
	Random numAleatorio = new Random();
	protected static int agenciaPadrao = 1;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.agenciaPadrao;
		this.numero = numAleatorio.nextInt(999999999);
		this.cliente = cliente;
	}
	public void sacar(int valor){ 
		this.saldo -= valor;
	}
	
	public void depositar(int valor) {
		saldo += valor;
	}

	public void transferir(int valor, Conta contaDestino) {
		sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %,d", this.numero));
		System.out.println(String.format("Saldo: R$%.2f", this.saldo));
	}
}
