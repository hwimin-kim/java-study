package person;

public class PersonTest {

	public static void main(String[] args) {
	       Student s1 = new Student();    
	       s1.setGrade(4);
	       
	       Person p1 = s1; // upcasting(암시적)
	       
	       // upcasting 시 부모 클래스의 메소드A가
	       // 자식 클래스에 오버라이딩 안되어있으면
	       // 해당 메소드 사용 불가
	       // p1.getGrade();
	       
	       // 오버라이딩된 메소드
	       p1.getAge();
	       
	       // downcasting 시
	       // 부모 클래스 메소드에 접근 가능
	       Student s2 = (Student)p1; //downcasting(명시적)
	       s2.getGrade();       
	}
}
