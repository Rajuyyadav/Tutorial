package Inputoutput;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Append1 {

	public static void main(String[] args) //throws Exception 
	{
					try {
					PrintWriter pw=new PrintWriter("C:\\IOFiles\\Newfile.txt");
					String  c="Welcome to java programming";
		
					pw.append(c);
					System.out.println("appended");
					pw.flush();
				}catch(Exception e) {System.out.println(e);}
		//
		PrintWriter pw = new PrintWriter(System.out);      
		char c='s';   
		pw.append(c);   
		pw.flush();  
	}
}
