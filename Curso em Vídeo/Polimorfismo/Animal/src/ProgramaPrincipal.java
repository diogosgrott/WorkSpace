
public class ProgramaPrincipal {

	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		m.setPeso(85.3);
		m.setIdade(2);
		m.setMembros(4);
		m.locomover();
		m.alimentar();
		m.emitirSom();
		
		p.setPeso(.35);
		p.setIdade(1);
		p.setMembros(0);
		p.locomover();
		p.alimentar();
		p.emitirSom();
		p.soltarBolas();
		
		a.setPeso(.89);
		a.setIdade(2);
		a.setMembros(2);
		a.locomover();
		a.alimentar();
		a.emitirSom();
		a.fazerNinho();
		
		Canguru canguru = new Canguru();
		canguru.locomover();
		
		Tartaruga tartaruga = new Tartaruga();
		tartaruga.locomover();
		
		Cachorro c = new Cachorro();
		c.emitirSom();
		
		c.reagir("Olá");
		c.reagir("Vai apanhar");
		c.reagir(11,45);
		c.reagir(21,00);
		c.reagir(true);
		c.reagir(false);
		c.reagir(2, 12.5);
		c.reagir(17, 4.5);

	}

}
