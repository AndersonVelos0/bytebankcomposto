package bytebankcomposto;

public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarConta = new Conta();
		System.out.println(contaDaMarConta.pegaSaldo());

		// foi necessário criar uma conta para que a mesma seja referenciada
		// populamos colocando um valor dentro dela, como abaixo
		contaDaMarConta.titular = new Cliente();
		System.out.println(contaDaMarConta.titular);

		// neste caso, retornará NULL pois está se referenciando para lugar nenhum
		// nome possui referencia, mas titular não possui
		contaDaMarConta.titular.nome = "Marcela";
		System.out.println(contaDaMarConta.titular.nome);
	}

}
