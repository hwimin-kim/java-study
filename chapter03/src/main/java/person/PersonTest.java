package person;

public class PersonTest {

	public static void main(String[] args) {
	       Student s1 = new Student();    
	       s1.setGrade(4);
	       
	       Person p1 = s1; // upcasting(암시적)
	       //p1.getGrade();
	       p1.getAge();
	       
	       Student s2 = (Student)p1; //downcasting(명시적)
	       s2.getGrade();
	       
	       Person p2 = new Student();
	       //p2.getGrade();
	      	       
	}
}
