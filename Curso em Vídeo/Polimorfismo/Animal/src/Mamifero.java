
public class Mamifero extends Animal {
	
	private String corPelo;

	@Override
	public void locomover() {
		System.out.println("O mam?fero se locomove correndo");
	}

	@Override
	public void alimentar() {
		System.out.println("O mam?fero se alimenta mamando");
	}

	@Override
	public void emitirSom() {
		System.out.println("O mam?fero emite som de mam?fero");
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	
	
	
}
