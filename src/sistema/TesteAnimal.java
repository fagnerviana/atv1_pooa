package sistema;

import modelos.Cachorro;

public class TesteAnimal {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Rex");
        dog.latir();  // Saída esperada: "Rex está latindo!"
    }

}
