
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(4401,10564489);
		// conta.numero = 1337; não funciona mais

		conta.setNumero(1337);
		// System.out.println(conta.getNumero());

		Cliente diogo = new Cliente();
		conta.setTitular(diogo);
		/*
		 * diogo.setNome("Diogo Sgrott"); diogo.setCpf("077.064.089-30");
		 * diogo.setProfissao("Corretor de Imóveis");
		 */

		conta.getTitular().setNome("Diogo Sgrott");
		conta.getTitular().setCpf("077.064.089-30");
		conta.getTitular().setProfissao("Corretor de Imóveis");

		System.out.println("Ag.: " + conta.getAgencia() + ". C.C.: " + conta.getNumero() + ".");
		System.out.println("Titular da Conta: " + conta.getTitular().getNome() + ".");
		System.out.println("CPF do Titular: " + conta.getTitular().getCpf() + ".");
		System.out.println("Profissão do Titular: " + conta.getTitular().getProfissao() + ".");

	}
}
