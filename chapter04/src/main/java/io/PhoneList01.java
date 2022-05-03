package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			File file = new File("phone.txt");
		
			if(!file.exists()) {
				System.out.println("file not found");
				return;
			}
		
			System.out.println("=================파일 정보==================");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + "bytes");
			System.out.println(
					new SimpleDateFormat(
							"yyyy-MM-dd hh:mm:ss")
					.format(new Date(file
							.lastModified()))
					);
			System.out.println("=================전화 번호==================");
		
			//1. 기반 스트림(FileInputStream)
			FileInputStream fis = new FileInputStream(file);
			//2. 보조 스트림1(byte|byte|byte -> char)
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			
			//3. 보조 스트림2(char1|char2|char3|\n ->	"char1char2char3")
			br = new BufferedReader(isr);
			
			//4. 처리
			String line = null;
			
			int index = 0;
			while((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, "\t ");
				
				while(st.hasMoreElements()) {
					String token = st.nextToken();
					if(index == 0 ) // 이름
						System.out.print(token + ":");
					else if(index == 1 || index == 2) // 전화번호1
						System.out.print(token + "-");
					else
						System.out.println(token);
					index ++;
				}
				index = 0;
			}
			} catch (UnsupportedEncodingException e) {
				System.out.println("Error:" + e);
			} catch (IOException e) {
				System.out.println("Error:" + e);
			} finally {
				try {
					if(br != null)
						br.close();
				} catch (IOException e) {
					System.out.println("Error:" + e);
				}
		}
	}
}
