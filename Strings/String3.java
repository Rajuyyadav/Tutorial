package Strings;

public class String3 {

	public static void main(String[] args) {

StringBuilder sb=new StringBuilder("tony");
System.out.println(sb);
System.out.println(sb.charAt(0));

System.out.println(sb.reverse());
System.out.println(sb.charAt(0));
sb.setCharAt(0,'p');
System.out.println(sb);
System.out.println(sb.reverse());
sb.setCharAt(3,'y');
System.out.println(sb);
System.out.println(sb.insert(0,'S'));
		



}

}
