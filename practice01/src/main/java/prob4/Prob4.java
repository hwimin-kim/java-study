package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String text = scanner.nextLine();
		char[] ch = new char[text.length()];
		
	    for (int i = 0; i < text.length(); i++) {
            ch[i] = text.charAt(i);
        }
	    
	    for(int i=ch.length; i>=1; i--) {
	    	for(int j=0; j<=ch.length-i; j++) {
	    		System.out.print(ch[j]);
	    	}
	    	System.out.println("");
	    }
		
		scanner.close();
	}

}
