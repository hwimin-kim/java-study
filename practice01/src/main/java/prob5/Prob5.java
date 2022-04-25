package prob5;

public class Prob5 {

	public static void main(String[] args) {
		
		for(int i=1; i<100 ;i++) {
			int q = i / 10; // 몫
			int r = i % 10; // 나머지
			
			if((q%3==0 && q!=0)||(r%3==0 && r!=0)) {
				System.out.println(i+"짝");
			}
		}
	
	}
}
