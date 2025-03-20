package questao10;

public class TarefaIncremento implements Runnable {

	Contador contador;
	int incremente;
	
	

	public TarefaIncremento(Contador contador, int incremente) {
		this.contador = contador;
		this.incremente=incremente;
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
	
	

}
