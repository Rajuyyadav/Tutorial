package Multithreading;

public class Wrapper {
	public static void main(String[] args) {
		int a=20;
		//Autoboxing
		
		Integer j=Integer.valueOf(a);
		Integer i=a;
		System.out.println(a+""+i+""+j);
		//unboxing
		Integer p=45;
		int q=p.intValue();
		int r=p;
		System.out.println(p+""+q+""+r);
		
	}

}
