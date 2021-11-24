
public class Reptil extends Animal {
	
	private String corEscama;
	

	@Override
	public void locomover() {
		System.out.println("O r�ptil se locomove rastejando");
	}

	@Override
	public void alimentar() {
		System.out.println("O r�ptil come vegetais");

	}

	@Override
	public void emitirSom() {
		System.out.println("O r�ptil mite sons de r�ptil");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	

}
