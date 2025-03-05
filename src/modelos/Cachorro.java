package modelos;


/*crie uma subclasse Cachorro que estende Animal e adiciona um método latir() 
 * que exibe uma mensagem usando o nome do animal (por exemplo, imprimindo algo como “ está latindo!")*/
public class Cachorro extends Animal{
	
	
	public Cachorro(String nome) {
		super(nome);
		
	}

	public void latir() {
		System.out.println(nome + " está latindo!");
				
	}
	
}
