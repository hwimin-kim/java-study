package prob5;

public class MainApp2 {

	public static void main(String[] args) {
		
		  try { MyStack2<String> stack = new MyStack2<>(3);
		  stack.push("Hello");
		  stack.push("World"); 
		  stack.push("!!!"); // 버퍼 늘리기 
		  stack.push("java");
		  stack.push(".");
		  
		  while (stack.isEmpty() == false) { 
		  String s = stack.pop();
		  System.out.println( s ); 
		  }
		  
		  System.out.println("======================================");
		  
		  stack = new MyStack2<>(3);
		  stack.push("Hello");
		  
		  System.out.println(stack.pop());
		  System.out.println(stack.pop());
		  
		  } catch (MyStackException ex) {
			  System.out.println(ex);
		  }
		 

	}

}
