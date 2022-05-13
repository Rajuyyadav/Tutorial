package Inputoutput;

import java.io.File;

public class ReadOnly1 {
	public static void main(String[] args) {
		//File f=new File("C:\\IOFiles\\Raju.txt");
		File f=new File("C:\\IOFiles\\createfile1.txt");
		boolean b=	f.setReadOnly();
		if(b==true) {
			System.out.println("set to read only mode");
		}else {System.out.println("unsuccessful operation");}
	//checking that readable or writable mode
		/*if(f.canWrite()){
			System.out.println("writable mode");

		}else {System.out.println("readable mode");}
		//read only file writable in java
	
		f.setWritable(true);
			*/if(f.canWrite()){
			System.out.println("writable mode");
		}
		else {
			System.out.println("readable mode");
			}

	}
}
