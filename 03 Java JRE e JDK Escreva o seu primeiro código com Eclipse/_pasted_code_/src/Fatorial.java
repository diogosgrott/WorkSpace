public class Fatorial {
	public static void main(String[] args) {

		System.out.println("MÉTODO 1");
		int resultadoTotal1 = 1;
		for (int contador = 1; contador <= 10; contador++) {
			resultadoTotal1 = resultadoTotal1 * contador;
			System.out.println(contador + "! é igual a " + resultadoTotal1);
		}

		System.out.println();
		System.out.println("MÉTODO 2");
		for (int x = 1; x <= 10; x++) {
			int resultadoTotal2 = 1;
			for (int y = 1; y <= 10; y++) {
				resultadoTotal2 = resultadoTotal2 * y;
				if (x == y) {
					System.out.println(x + "! é igual a " + resultadoTotal2);
					break;
				}
			}
		}
	}
}
