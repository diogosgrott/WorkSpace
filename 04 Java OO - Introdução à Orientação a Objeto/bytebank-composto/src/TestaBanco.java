
public class TestaBanco {
	public static void main(String[] args) {
		Cliente diogo = new Cliente();
		diogo.nome = "Diogo Sgrott";
		diogo.cpf = "077.064.089-30";
		diogo.profissao = "Corretor de Imóveis";

		Conta contaDoDiogo = new Conta();
		contaDoDiogo.deposita(100);
		
		contaDoDiogo.titular = diogo;
		
		System.out.println(contaDoDiogo.titular.nome);
		System.out.println(contaDoDiogo.titular.cpf);
		System.out.println(contaDoDiogo.titular.profissao);
	}

}
