package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("hello.txt");
			int data = fis.read();
			System.out.println((char)data);
			
		}catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다." + e);
		}catch (IOException e) {
			System.out.println("파일이 없습니다." + e);
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
