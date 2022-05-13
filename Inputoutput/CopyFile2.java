package Inputoutput;
import java.io.*;

import java.util.*;

public class CopyFile2 {
	public void get(File a,File b) {
		try {
		FileInputStream fis =new  FileInputStream(a);
		FileOutputStream fos =new  FileOutputStream(b);
		int i;
		while((i=fis.read())!=-1) {
			fos.write(i);
		}
		fis.close();
		fos.close();
		System.out.println("file copied");


		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("enter the src file");
String a=sc.nextLine();
File x=new File(a);

System.out.println("enter the dest file");
String b=sc.nextLine();
File y=new File(b);
CopyFile2 c=new CopyFile2();
c.get(x,y);
}
}
