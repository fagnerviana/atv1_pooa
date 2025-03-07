package modelos;

public class Retangulo extends Forma{
	
	private double largura;
	private double altura;

	public Retangulo(double largura, double altura) {
		this.largura=largura;
		this.altura=altura;
	}
	
	@Override
	public double calcularArea() {
		return largura*altura;
	}
	

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}



	
	
	
	
	
		
}
