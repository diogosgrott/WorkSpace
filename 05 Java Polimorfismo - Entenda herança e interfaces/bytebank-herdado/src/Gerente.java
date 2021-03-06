//Gerente tamb?m ? Funcion?rio Autenticavel, e ent?o um Funcionario, herda atributos e m?todos de Funcion?rio
//Gerente tbm tem que ser Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Gerente(){
		this.autenticador = new AutenticacaoUtil();
	}

	public double getBonificacao() {
		System.out.println("Chamando m?todo de bonifica??o do Gerente");
		return super.getSalario();
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
}