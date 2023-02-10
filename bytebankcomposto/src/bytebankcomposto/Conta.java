package bytebankcomposto;
public class Conta {

	double saldo;
	int agencia;
	int numero;
	// O tipo cliente foi criado para referenciar na Conta
	Cliente titular;

	void deposita(double valor) {
		// foi necessário criar uma lógica para que o método fosse atribuido
		// o this foi atribuido para fazer referencia a esse saldo da conta
		// nesse caso o this se refere ao objeto conta do testaMetodos
		this.saldo = saldo + valor;
	}

	public boolean saca(double valor) {
		// o método por hora não compila pelo retorno de booleano
		if (saldo >= valor) {
			this.saldo = saldo - valor;
			// caso o valor esteja disponível na conta, retornará verdadeiro
			return true;
			// caso não tenha dinheiro, retorna falso
		} else {
			return false;
		}
	}
	
	// esse método irá transferir dinheiro da conta 
	public boolean transfere(double valor, Conta destino) {
		if (saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}

	}
}
