package questao10;

public class TesteSincronizacao {

	public static void main(String[] args) {
		
		Contador contadorCompartilhado = new Contador();
        int numThreads = 4;
        int incPorThread = 1000;

        Thread[] threads = new Thread[numThreads];
        // Cria e inicia 4 threads, cada uma executando 1000 incrementos
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(new TarefaIncremento(contadorCompartilhado, incPorThread));
            threads[i].start();
        }

        // Aguarda todas as threads terminarem (join)
        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrompida durante join.");
            }
        }

        // Exibe o resultado esperado e o obtido
        int esperado = numThreads * incPorThread;
        int obtido = contadorCompartilhado.getCount();
        System.out.println("Valor esperado: " + esperado);
        System.out.println("Valor obtido: " + obtido);
    }

}
