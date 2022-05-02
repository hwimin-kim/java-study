package prob06;

public abstract class Arith {
	int a;
	int b;
		
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public abstract int calculate();
}
