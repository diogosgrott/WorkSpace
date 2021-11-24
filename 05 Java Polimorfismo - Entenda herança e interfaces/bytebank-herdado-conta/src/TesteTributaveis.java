
public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100);

		SeguroDeVida seguro = new SeguroDeVida();

		CalculadorDeImposto calculador = new CalculadorDeImposto();
		calculador.registra(cc);
		calculador.registra(seguro);

		System.out.println("Total de Imposto � de R$ " + calculador.getTotalImposto());

	}

}
