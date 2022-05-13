package Inputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\IOFiles\\Raju12.txt");
		try {
			if(f.createNewFile())
				System.out.println("file created");
			
			FileWriter fos=new FileWriter("C:\\IOFiles\\Raju12.jpeg");
			fos.write("kzxhjzg");
			fos.close();
			System.out.println("written the content ");
			FileInputStream fis =new  FileInputStream("C:\\IOFiles\\Raju12.txt");
			int i;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			} 
		}catch (IOException e1) {
				e1.printStackTrace();
			}


		}
	}
