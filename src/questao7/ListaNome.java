package questao7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class ListaNome {

	public static void main(String[] args) {
		
		//sc vai guardar o que for digitado
		Scanner sc = new Scanner(System.in);
		String nome;
		//Criando uma lista de Pessoa e utilizando o Arraylist
		List<Pessoa> lista = new ArrayList<Pessoa>();
		lista.add(new Pessoa("Ana"));
		lista.add(new Pessoa("Bruno"));
		lista.add(new Pessoa("Carlos"));
		lista.add(new Pessoa("Daniela"));
		
		System.out.println("Lista Completa");
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa.getNome());
		}
		
		System.out.println("Digite um nome para ser excluido da lista");
		nome = sc.nextLine();
		
		System.out.println("Lista Atualizada");
		//remove a pessoa , com o nome digitado 
		lista.removeIf(pessoa -> pessoa.getNome().equalsIgnoreCase(nome));
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa.getNome());
		}
		
		
		sc.close();

	}

}
