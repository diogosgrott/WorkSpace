
public class ProgramaPrincipal {

	public static void main(String[] args) {
		Visitante v1 = new Visitante();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		
		p2.setNome("Maria");
		p3.setNome("Claudio");
		
		p2.setIdade(18);
		
		p2.setCurso("Informática");
		p3.setSalario(2500.75);
		
		p3.receberAumento(550.50);
		
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p3.getSalario());

	}

}
