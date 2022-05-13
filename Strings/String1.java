package Strings;

public class String1 {
public static void main(String[] args) {
	String s="welcome"; // string literal.
	char ch[]= {'j','a','v','a'};
	String s1=new String(ch);//converting from char to string.
	String s2=new String("how are you");//String by using new keyword.
	
//o/p
	System.out.println(s);
	System.out.println(s1);
	System.out.println(s2);
	//
	String s3="welcome"; // string literal.	
	System.out.println(s3);

	String s4="welcome"; // string literal.	
	System.out.println(s4);
s3=s3.concat("u all");
System.out.println(s3);

System.out.println(s4);
s2=s2.concat("all");
System.out.println(s2);

String a="ankit"; // string literal.	
System.out.println(a);

String b="ankit"; // string literal.	
System.out.println(b);

a="kumar"; // string literal.	
System.out.println(a);
System.out.println(b);

}
}
