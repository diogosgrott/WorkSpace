
public class Peixe extends Animal {
	
	private String corEstama;
	
	public void soltarBolas(){
		System.out.println("Soltou uma bolha");
	}

	@Override
	public void locomover() {
		System.out.println("O peixe se locomove nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("O peixe come subst�ncias");

	}

	@Override
	public void emitirSom() {
		System.out.println("O peixe n�o emite sons");
	}

	public String getCorEstama() {
		return corEstama;
	}

	public void setCorEstama(String corEstama) {
		this.corEstama = corEstama;
	}
	
	

}
