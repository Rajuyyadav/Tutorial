package Strings;

public class String2 {
public static void main(String[] args) {
	String fname="tony";
	String lname="stark";
	
	System.out.println(fname);
	
String fullname=fname+lname;
System.out.println(fullname);
System.out.println(fullname.length());//length
//charAt
//for(int i=0;i<=fullname.length();i++) {
//	System.out.println(fullname.charAt(i));//charAt
//}
//compare
String name1="stark";
String name2="stark";
if(name1.compareTo(name2)==0) {
	System.out.println("equal");
}else if(name1.compareTo(name2)>1) {
	System.out.println("greater");
}else {System.out.println("smaller");}
//
String name="my name is tony stark";
System.out.println(name.substring(11,name.length()));
System.out.println(name.substring(0,5));
System.out.println(name1.compareTo(name2));

}
}
