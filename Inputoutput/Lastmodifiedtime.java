package Inputoutput;
import java.io.File;
import java.util.*;

//import java.text.DateFormat;
//import java.text.SimpleDateFormat;

public class Lastmodifiedtime {
public static void main(String[] args) {
/*	File f=new File("C://IOFiles//Raju12");
	File f2=new File("C://IOFiles//Raju");

long l= f.lastModified();
long l2= f2.lastModified();

DateFormat d=new SimpleDateFormat("MMMM,dd yyyy hh:mm a");
System.out.println(d.format(l));
System.out.println(d.format(l2));
	System.out.println(f);
	*/
	File f=new File("C:\\IOFiles\\Raju12.jpeg");
	long l= f.lastModified();
	Date d=new Date(l);
	System.out.println(d);
	
}
}
