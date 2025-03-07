package sistema;

import modelos.Circulo;
import modelos.Forma;
import modelos.Retangulo;

//Classe de teste para demonstrar o uso das classes abstratas e suas subclasses
class TesteFormas {
 public static void main(String[] args) {
	
	 Forma f1 = new Retangulo(5.0, 4.0);
     Forma f2 = new Circulo(3.0);
     System.out.println("Área do Retângulo: " + f1.calcularArea());  // 5*4 = 20.0
     System.out.println("Área do Círculo: " + f2.calcularArea());    // π*3^2 ≈ 28.27
 }
}