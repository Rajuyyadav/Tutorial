package Strings;
import java.util.StringTokenizer;
public class Tokenizer1 {
public static void main(String[] args) {
	StringTokenizer st=new StringTokenizer("my name is ramesh");
//System.out.println(st.nextToken(","));
while(st.hasMoreTokens()) {
	System.out.println(st.nextToken());
}
}   
}
