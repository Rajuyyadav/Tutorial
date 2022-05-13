package Inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class FileInGZIP {

	public static void main(String[] args) throws IOException {
String src="C:\\IOFiles\\Raju.txt";
String dest="C:\\IOFiles\\Raju.gzip";
FileInGZIP fig=new FileInGZIP();
fig.filegzip(src,dest);
	}
	public void filegzip(String src,String dest) throws IOException
	{
		byte[] b=new byte[1024];
		
		FileOutputStream fos =new FileOutputStream(dest);
		GZIPOutputStream gos=new GZIPOutputStream(fos);
		FileInputStream fis=new FileInputStream(src);
		int i;
		while((i=fis.read(b))>0) {
			gos.write(b,0,i);
		}
		fis.close();
		gos.flush();
		
		gos.close();
		//fos.close();

		System.out.println("file converted to gzip format");
		
		
	}
	
}
