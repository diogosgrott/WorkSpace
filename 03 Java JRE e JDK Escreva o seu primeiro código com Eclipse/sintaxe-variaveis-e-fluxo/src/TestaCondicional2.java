
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicional");
		int idade = 19;
		int quantidadePessoas = 4;
		boolean acompanhado = quantidadePessoas>=2;

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Voc� tem menos de 18 anos e est� sozinho. N�o pode entrar.");
		}
	}
}
