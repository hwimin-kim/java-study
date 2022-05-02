package collection;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		
		s.push("둘리");
		s.push("마이콜");
		s.push("도우너");
		
		while(!s.empty()) {
			String data= s.pop();
			System.out.println(data);
		}
		
		// 비어있는 경우 예외 발생
		// s.pop();
		
		s.push("둘리");
		s.push("마이콜");
		s.push("도우너");
		
		System.out.println(s.pop());
		System.out.println(s.peek()); // 스택의 top 값 확인
		System.out.println(s.pop());
	}

}
