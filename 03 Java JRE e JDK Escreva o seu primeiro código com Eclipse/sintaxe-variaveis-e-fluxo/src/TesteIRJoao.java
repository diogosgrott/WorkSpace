
public class TesteIRJoao {
	public static void main(String[] args) {
		double salario = 5800;

		if (salario >= 1900 && salario <= 2800) {
			System.out.println("O IR � de 7.5% e pode deduzir na declara��o o valor de R$ 142");
		} else if (salario > 2800 && salario <= 3751) {
			System.out.println("O IR � de 15% e pode deduzir R$ 350");
		} else if (salario > 3751 && salario <= 4664) {
			System.out.println("O IR � de 22.5% e pode deduzir R$ 636");
		}
	}

}
