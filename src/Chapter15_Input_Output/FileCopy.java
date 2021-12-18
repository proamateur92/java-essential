package Chapter15_Input_Output;

import java.io.*;

public class FileCopy {

	public static void main(String[] args) {
		FileInputStream fis;
		try {
			fis = new FileInputStream("original");
			FileOutputStream fos = new FileOutputStream("originCopy");
			
			int data =0;
			while((data=fis.read())!=-1) {
				fos.write(data);	// void write(int b)
			}
			
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
