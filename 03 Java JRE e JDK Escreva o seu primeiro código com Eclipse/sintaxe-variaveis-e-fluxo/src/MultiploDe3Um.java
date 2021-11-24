
public class MultiploDe3Um {
	public static void main(String[] args) {
		// metodo 1
		// for(int contador = 0; contador<=100; contador+=3){
		// System.out.println(contador);
		// }

		for (int contador = 0; contador <= 100; contador++) {
			if (contador % 3 == 0) {
				System.out.println(contador);
			}
		}
	}
}
