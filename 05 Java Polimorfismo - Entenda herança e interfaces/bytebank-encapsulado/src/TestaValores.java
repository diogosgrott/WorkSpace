
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(4401, 10564489);

		Conta conta2 = new Conta(4401, 10564490);

		Conta conta3 = new Conta(4402, 10564490);

		System.out.println("Há no total " + Conta.getTotal() + " contas criadas.");

	}

}
