
public class Aluno extends Pessoa {
	private int matricula;
	private String curso;

	// se escrever public final void pagarMensalidade,
	// n�o tem como fazer sobreposi��o na filha bolsita
	public void pagarMensalidade() {
		System.out.println("Mensaidade Paga");
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
