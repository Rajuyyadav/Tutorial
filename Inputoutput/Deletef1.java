package Inputoutput;

import java.io.File;

public class Deletef1 {

	public static void main(String[] args) {
		try {
		File fr= new File("C:\\IOFiles\\Raju.txt");
		if(fr.delete()){
			System.out.println(fr.getName()+"deleted");
		}else{System.out.println("failed");}
		System.out.println(fr);
		}catch(Exception e){System.out.println(e);}
	}

}
