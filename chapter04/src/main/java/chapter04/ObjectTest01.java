package chapter04;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point p = new Point(10, 10);
		
		// Class c1 = p.getClass();
		System.out.println(p.getClass().getName()); // reflection
		System.out.println(p.hashCode()); // address 기반의 해싱 값
										  // address x
										  // reference x
		System.out.println(p.toString()); // getClass() + "@" hashCode();
		System.out.println(p);
		System.out.println();
	}

}
