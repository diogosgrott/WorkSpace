
public class ControleDeBonificacao {
	
	private double soma;
	
	public void registra(Funcionario f){
		double boni = f.getBonificacao();
		soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}
	

}
