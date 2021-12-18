package Chapter15_Input_Output;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx3 {

	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] temp = new byte[4];
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		System.out.println("Input Source: "+input);
		
		try {	// read나 write가 에러를 발생시킬 수 있음.
			while(input.available()>0) {	// blocking없이 읽어 올 수 있는 바이트 수 반환. 
				input.read(temp);			// blocking: 데이터를 읽어올 때 기다리기 위해 멈춰있는 것.
				output.write(temp);
//				System.out.println("temp: "+Arrays.toString(temp));
				
				outSrc = output.toByteArray();
				printArrays(temp, outSrc);
			}
		} catch(Exception e) {}
		
	}
	static void printArrays(byte[] temp, byte[] outSrc) {
		System.out.println("temp: "+Arrays.toString(temp));
		System.out.println("Output Source: "+Arrays.toString(outSrc));
	}
}
