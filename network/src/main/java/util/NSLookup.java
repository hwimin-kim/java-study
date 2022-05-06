package util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class NSLookup {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String host = null;
		InetAddress[] inetAddress = null;
		
		do {
			System.out.println("주소 입력 >>");
			host = scanner.nextLine();
			
			if("exit".equals(host)) {
				scanner.close();
				System.out.println("종료");
				break;
			}
			
			try {
				inetAddress = InetAddress.getAllByName(host);
				for(InetAddress data : inetAddress) {
					System.out.println(data.getHostName() + " : " + data.getHostAddress());
				}
			
			} catch (UnknownHostException e) {
				System.out.println("존재하지 않는 host 입니다.");
			}
			
		} while(host != "exit");
		
	}

}
