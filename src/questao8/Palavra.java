package questao8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Palavra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a sua frase:");
		String mesnagem = sc.nextLine();
		
		String[] separarPalavras = mesnagem.toLowerCase().split("\\s+");
		
		Map<String, Integer> contador = new HashMap<>();
		
		for (String palavra : separarPalavras) {
			
			//contador.put(palavra,contador.getOrDefault(palavra, 0)+1);
			contador.put(palavra,contador.getOrDefault(palavra, 0)+1);
		}
		
		  // Exibir a contagem de palavras
        System.out.println("Frequência das palavras:");
        for (Map.Entry<String, Integer> entry : contador.entrySet()) {
        	
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        sc.close();
	}

}
