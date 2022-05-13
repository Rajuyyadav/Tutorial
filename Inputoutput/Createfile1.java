package Inputoutput;

import java.io.File; 
public class Createfile1 {
	public static void main(String[] args) {
//		File f=new File("C:\\IOFiles\\Raju.txt");
//		try {
//			if(f.createNewFile())
//			{
//				System.out.println("File Created Successfully");
//			}
//			else
//			{
//				System.out.println("Failed to Create File");
//			}
//		} catch (Exception e) 
//		{
//			e.printStackTrace();
//		}
		
		
		
		
		
		
		File f=new File("C:\\IOFiles\\createfile1.txt");
	//	String s;
		try {
			if(f.createNewFile()) {
				System.out.println("file created"+f.getCanonicalPath());
			}else {
				System.out.println("file not created");

			}
		 	
		}catch(Exception e) {
			System.out.println(e);		
		}
		
	}
}
