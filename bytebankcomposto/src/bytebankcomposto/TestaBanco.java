package bytebankcomposto;

public class TestaBanco {
	public static void main(String[] args) {
		// objeto foi criado sendo referenciado à classe (método)
		Cliente paulo = new Cliente();
		paulo.nome = "Paula Tejano";
		paulo.cpf = "111.111.111.-56";
		paulo.profissao = "Programador";
		
		// novo objeto criado para depositar saldo na conta
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		//trecho onde o objeto representa a mesma coisa, só que escrita diferente
		// esse trecho associa o cliente paulo a contaDoPaulo
		contaDoPaulo.titular = paulo;
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.titular);
		System.out.println(paulo);
	}

}
