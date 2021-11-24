
public class CriaConta {
	public static void main(String[] args) {
		new Conta();
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		primeiraConta.agencia = 146;
		// System.out.println(primeiraConta.saldo);
		System.out.println("Primeira Conta tem: R$ " + primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 200;
		segundaConta.agencia = 146;

		System.out.println("Segunda Conta tem: R$ " + segundaConta.saldo);
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
