
public class TestaEscopoDeVariaveis {
	public static void main(String[] args) {
		System.out.println("Testando condicional");
		int idade = 19;
		int quantidadePessoas = 1;
		// boolean acompanhado = quantidadePessoas>=2;
		boolean acompanhado;

		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Você tem menos de 18 anos ou está sozinho. Não pode entrar.");
		}
	}
}
