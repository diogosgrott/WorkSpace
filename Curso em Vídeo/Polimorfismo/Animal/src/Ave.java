
public class Ave extends Animal {
	
	private String corPena;
	
	public void fazerNinho(){
		System.out.println("Construiu um ninho");
	}

	@Override
	public void locomover() {
		System.out.println("A ave se locomove voando");
	}

	@Override
	public void alimentar() {
		System.out.println("A ave come insetos");

	}

	@Override
	public void emitirSom() {
		System.out.println("A ave mite sons de ave");
	}

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

//	
}
