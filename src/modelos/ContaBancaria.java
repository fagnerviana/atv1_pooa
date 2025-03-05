package modelos;



/*
 * Implemente uma classe ContaBancaria usando encapsulamento para proteger seu estado interno. 
 * A classe deve possuir um atributo privado saldo (por exemplo, do tipo double) 
 * E métodos públicos depositar(double valor) e sacar(double valor).*/
public class ContaBancaria {
	//um atributo privado saldo
	private double saldo;
	
	
	//O método depositar deve adicionar o valor ao saldo se for positivo
	public void depositar(double valor) {		
		this.saldo += valor;
	}
	//O método sacar deve subtrair o valor do saldo apenas se houver saldo suficiente
	public boolean sacar(double valor) {
		
		if(this.saldo>=valor) {
		this.saldo -=valor;
		return true;
		}else {
			return false;
			
		}
	}	
	
	public ContaBancaria() {
		
	}
	
   public ContaBancaria(double saldo) {
		this.saldo=saldo;
	}
	
	//Forneça também um método getSaldo() para consultar o saldo atual.
	public double getSaldo() {
		return saldo;
	}

	
	

}
