
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicional");
		int idade = 19;
		int quantidadePessoas = 1;

		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} else if (quantidadePessoas>=2){
			System.out.println("Voc� n�o tem 18 anos, mas est� acompanhado. Pode entrar");
		} else{
			System.out.println("Voc� tem menos de 18 anos e est� sozinho. N�o pode entrar.");
		}
	}

}
