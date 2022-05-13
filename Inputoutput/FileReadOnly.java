package Inputoutput;

import java.io.File;

public class FileReadOnly {
	public static void main(String[] args) {
		File f=new File("C:\\IOFiles\\Raju.txt");
		boolean flag=f.setReadOnly();
		if(flag==true)
		{
			System.out.println(" File successfully converted to read only");
		}
		else
		{
			System.out.println("Failed to convert the file to Read Only");
		}
	}

}
