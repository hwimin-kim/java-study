package chapter03;

public class StaticMethod {
	int n;
	static int m;
	
	void f1() {
		System.out.println(this.n);
	}
	
	void f2() {
		System.out.println(m);
	}
	
	void f3() {
		f2();
	}
	
	void f4() {
		s1();
	}
	
	static void s1() {
		// 오류: static method에서는 인스턴스 필드 접근 할 수 없다.
		// System.out.println(n);
	}
	static void s2() {
		// StaticMethod.m == m
		// 생략 가능
		System.out.println(m);
	}
	static void s3() {
		//오류: static method에서는 인스턴스 메소드에 접근 할 수 없다.
		//f1();
	}
	static void s4() {
		s1();
	}
}
