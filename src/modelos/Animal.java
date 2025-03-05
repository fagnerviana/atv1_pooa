package modelos;

/*Crie uma classe base Animal com um atributo nome. 
 * Inicialmente, defina nome como protected.
 * */
public class Animal {
	
	protected String nome;
	
	public Animal(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
		
}
