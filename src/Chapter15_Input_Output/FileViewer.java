package Chapter15_Input_Output;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileViewer {

	public static void main(String[] args) throws IOException {
//		FileOutputStream fos = new FileOutputStream("123");
//		System.out.println(fos);
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		FileInputStream fis = new FileInputStream(str);
		int data = 0;
		
		while((data=fis.read()) != -1) {
			char c = (char)data;
			System.out.println(c);
		}
	}

}
