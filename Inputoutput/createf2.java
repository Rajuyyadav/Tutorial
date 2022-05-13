package Inputoutput;
import java.io.*; 

public class createf2 {
public static void main(String[] args) {
	try {
	FileOutputStream fos =new  FileOutputStream("C:\\IOFiles\\Raju.txt");
	String s=",jscbydb";
	
	byte[] b=s.getBytes();
	fos.write(b);
	fos.write(65);
	fos.close();
	System.out.println("success");
	}catch(Exception e) {System.out.println(e);}
}
}
