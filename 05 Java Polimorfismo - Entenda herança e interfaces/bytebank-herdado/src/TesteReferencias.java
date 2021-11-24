
public class TesteReferencias {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		
		g1.setNome("Diogo");
		g1.setSalario(5000);
		
		EditorDeVideo ev1 = new EditorDeVideo();
		ev1.setSalario(2500);
		
		Designer d = new Designer ();
		d.setSalario(2000);
		
		ControleDeBonificacao controle = new ControleDeBonificacao();
		controle.registra(g1);
		controle.registra(ev1);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
	}
}
