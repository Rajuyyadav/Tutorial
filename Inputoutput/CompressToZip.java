package Inputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class CompressToZip {
	public static void main(String[] args) throws IOException {
		File src=new File("C:\\IOFiles\\Pandu.txt");
		File dst=new File("C:\\IOFiles\\Pandu.gzip");
		CompressToZip c=new CompressToZip();
		c.Zip(src,dst);
	}

	private void Zip(File src, File dst) throws IOException {
		byte[] data = new byte[1024];
		FileOutputStream fos=new FileOutputStream(dst);	
		GZIPOutputStream gos=new GZIPOutputStream(fos);
		FileInputStream fis=new FileInputStream(src);
		int i;
		try {
			while ((i = fis.read(data)) != -1) {
				gos.write(data, 0, i);
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("File Compressed Successfully");
	}
}
