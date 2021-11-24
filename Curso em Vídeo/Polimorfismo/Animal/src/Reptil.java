
public class Reptil extends Animal {
	
	private String corEscama;
	

	@Override
	public void locomover() {
		System.out.println("O réptil se locomove rastejando");
	}

	@Override
	public void alimentar() {
		System.out.println("O réptil come vegetais");

	}

	@Override
	public void emitirSom() {
		System.out.println("O réptil mite sons de réptil");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	

}
