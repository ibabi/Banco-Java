package bancoJava;

public class Main {

	public static void main(String[] args) {
		
		Cliente andre = new Cliente();
		andre.setNome("André");
		Cliente jose = new Cliente();
		jose.setNome("José");
		
		ContaCorrente cc = new ContaCorrente(andre);
		ContaPoupança cp = new ContaPoupança(jose);
		
		cc.depositar(1300);
		cc.transferir(400, cp);

		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
