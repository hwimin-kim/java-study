package prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		/* 코드를 완성합니다 */
		
		char[] ch = str.toCharArray();
		char[] r_ch= new char[ch.length];
		for(int i=0; i<ch.length ;i++) {
			r_ch[i] = ch[ch.length-i-1];
		}
		return r_ch;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		for(int i=0 ; i< array.length; i++) {
		System.out.print( array[i] );
		}
		System.out.println("");
	}
}