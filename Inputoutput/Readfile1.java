package Inputoutput;
import java.io.FileInputStream;
import java.io.FileReader;

//import java.io.*;

public class Readfile1 {
	public static void main(String[] args) //throws Exception
	{

		try {
			FileReader fr= new FileReader("C:\\IOFiles\\Newfile.txt");
			int i;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
				System.out.println( " "+i);
			}
			fr.close();
		}catch(Exception e) {System.out.println(e);}


		System.out.println("--------------------------------------------------");
		//read single character
		try {
			FileInputStream fis=new FileInputStream("C:\\IOFiles\\Newfile.txt");
			int i=fis.read();
			System.out.println((char)i);
			fis.close();
		}catch(Exception e) {System.out.println(e);}


		System.out.println("--------------------------------------------------");
		try {
			FileInputStream fis=new FileInputStream("C:\\IOFiles\\Newfile.txt");
			int i=0;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
			fis.close();
		}catch(Exception e) {System.out.println(e);}		

	}

}