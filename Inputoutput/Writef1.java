package Inputoutput;
import java.io.FileWriter;

public class Writef1 {
public static void main(String[] args) {
	try {
	FileWriter fw=new FileWriter("C:\\IOFiles\\Newfile.txt",true);
	fw.write(" welcome");
	fw.close();
	
	}catch(Exception e) {System.out.println(e);}
	System.out.println("success");
	
	
}
}
