
public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200);
		
		cc.transfere(10, cp);
		
		System.out.println("Saldo da Conta Corrente: R$ "+cc.getSaldo());
		System.out.println("Saldo da Conta Poupan�a: R$ "+cp.getSaldo());
		
		
	}

}
