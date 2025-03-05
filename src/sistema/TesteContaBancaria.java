package sistema;

import modelos.ContaBancaria;

public class TesteContaBancaria {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria(1000.0); // saldo inicial de 1000
        conta.depositar(500.0);
        System.out.println("Saldo após depósito: " + conta.getSaldo()); // Esperado 1500.0

        // Tentativa de saque acima do saldo disponível
        boolean resultadoSaque = conta.sacar(2000.0);
        System.out.println("Saque de 2000 realizado? " + resultadoSaque); // Esperado false
        System.out.println("Saldo após tentativa de saque: " + conta.getSaldo()); // Saldo permanece 1500.0

        // Saque dentro do limite do saldo
        boolean resultadoSaque2 = conta.sacar(1000.0);
        System.out.println("Saque de 1000 realizado? " + resultadoSaque2); // Esperado true
        System.out.println("Saldo final: " + conta.getSaldo()); // Esperado 500.0
    }
}