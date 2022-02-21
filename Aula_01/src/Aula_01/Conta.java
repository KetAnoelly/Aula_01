package Aula_01;

public class Conta {
	
	public int numero;
	public float saldo;
	
	public Conta(int numero, float saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public String retornaConta() {
		return "Número da conta: " +this.numero + " Saldo: " + this.saldo;
	}
	public void creditaSaldo(float valorCreditado) {
		this.saldo = this.saldo + valorCreditado;
	}

}
