
public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario diogo = new Gerente();
		diogo.setNome("Diogo");
		diogo.setCpf("077.064.089-30");
		diogo.setSalario(2500);
		
		System.out.println(diogo.getNome());
		System.out.println(diogo.getCpf());
		System.out.println(diogo.getBonificacao());

	}
}
