
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoDiogo = new Conta();
		contaDoDiogo.saldo = 100;
		contaDoDiogo.deposita(50);
		
		System.out.println(contaDoDiogo.saldo);
		
		contaDoDiogo.saca(20);
	
		System.out.println(contaDoDiogo.saldo);	
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		if (contaDaMarcela.transfere(3000,contaDoDiogo)){
			System.out.println("Transferência feita com sucesso.");
		}else{
			System.out.println("Saldo insuficiente.");
		}
		
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoDiogo.saldo);
		
		contaDoDiogo.titular = "Diogo Sgrott";
		System.out.println(contaDoDiogo.titular);
	}

}
