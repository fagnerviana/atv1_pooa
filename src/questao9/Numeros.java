package questao9;

public class Numeros implements Runnable {

	int num;

	@Override
	public void run() {
		System.out.println(num);

	}

	public Numeros(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
