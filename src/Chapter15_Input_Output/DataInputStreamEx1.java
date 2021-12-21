package Chapter15_Input_Output;

import java.io.*;

public class DataInputStreamEx1 {

	public static void main(String[] args) {
		FileInputStream fis;
		try {
			fis = new FileInputStream("sample.dat");
			DataInputStream dis = new DataInputStream(fis);
			
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readBoolean());
		} catch (IOException e) {
			e.printStackTrace();
		}
	} // main
}
