package questao10;

public class Contador {
	
	int count;
	
	public void incrementar() {
		count+=count+1;
		
		
	}

	public Contador(int count) {
		super();
		this.count = count;
	}
	
	public Contador() {
	}
	

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
	
	

}
