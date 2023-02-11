package bytebankcomposto;

public class TesteSacaValoresNegativos {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.deposita(100);
		// não irá sacar devido a retornar saldo negativo
		conta.saca(200);
		// podemos passar um parametro no print como abaixo
		// então ele mostrará false pois a classe não possui opçao para sacar negativos
		System.out.println(conta.saca(200));
		//System.out.println(conta.saldo);
		conta.saca(101);
		// Caso queiramos forçar uma alteração na tipo Conta, podemos fazer da seguinte forma:
		//conta.saldo = conta.saldo - 101;
		//System.out.println(conta.saldo);
		// contudo, isso não são boas práticas, não deve-se alterar o atributo de forma direta, apenas acessando métodos
		// no java você pode encapsular essa informação na classe, nesse caso, na classe conta (private double saldo)
		// após privarmos o atributo, ele não será alterado de forma alguma sem a devida permissão, apenas a classe Conta
		// será dona dela mesma.
		// um atributo privado não pode ser nem alterado, nem lido diretamente.
		
		
		//invocando um método
		
		// agora o saldo estará sendo mostrado, pois estamos acessando o valor via métodos
		//esse é o principio de encapsulamento, declarando um atributo como private
		System.out.println(conta.pegaSaldo());
	}

}
