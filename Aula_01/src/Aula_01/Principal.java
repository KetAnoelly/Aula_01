package Aula_01;

public class Principal {
	
	public static void main(String[] args) {
		
		Cliente cliente_01 = new Cliente("02850435902", 1980, "Marcos da Rocha Souza", "mr_souza@gmail.com");
		System.out.println(cliente_01.retornaCliente());
		
		Conta conta_01 = new Conta(1521, 750.63f);
		System.out.println(conta_01.retornaConta());
		
	}


}
