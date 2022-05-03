package prob5;

@SuppressWarnings("unchecked")
public class MyStack2 <T> {
	private int top = 0;
	private T [] buffer;
	
	public MyStack2(int size) {
		buffer = (T[])new Object [size];
	}
	
	public void push(T item) {
		if(top == buffer.length) {
			T[] temp = buffer;
			buffer = (T[])new Object [buffer.length*2];
			for(int i = 0; i<temp.length; i++) {
				buffer[i]  = temp[i];
			}
		}
		buffer[top] = item;
		top ++;
	}
	
	public T pop() throws MyStackException{
		if(top <0 ) {
			throw new MyStackException();
		}
		
		if(buffer[top] == null) {
			top --;
		}

		T item = buffer[top];
		buffer[top] = null ;
		top --;
		return item;
	}
	
	public boolean isEmpty() {
		if(top < 0)
			return true;
		else
			return false;	
	}
}