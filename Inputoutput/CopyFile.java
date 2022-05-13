package Inputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
public static void main(String[] args) throws Exception {
	File f=new File("C:\\IOFiles\\new.txt");
	f.createNewFile();
	
	FileOutputStream fos=new FileOutputStream("C:\\IOFiles\\new.txt");
	FileInputStream fis=new FileInputStream("C:\\IOFiles\\Newfile.txt");
	int i;
while((i=fis.read())!=-1) {
	fos.write(i);
}
fis.close();
fos.close();
System.out.println("done text copied");

}
}
