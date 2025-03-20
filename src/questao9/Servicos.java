package questao9;

public class Servicos {

	public static void main(String[] args) {
		
		Runnable tarefa1 = new Numeros(5);
        Runnable tarefa2 = new Numeros(2);

        Thread t1 = new Thread(tarefa1);
        Thread t2 = new Thread(tarefa2);

        t1.start();
        t2.start();

        System.out.println("Threads iniciadas!");
    }

}
