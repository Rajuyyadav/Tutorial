package Multithreading;
public class Multi2 extends Thread{
	public void run(){
		for(int i=1;i<=5;i++) {
		try {Thread.sleep(500);}catch(InterruptedException e) {System.out.println(e);}
		System.out.println(i);
		}
	}
public static void main(String[] args) {
//Thread t=new Thread("my first thread");
	
//	String str=t.getName();
//	System.out.println(str);
	Multi2 t1=new Multi2();
	Multi2 t2=new Multi2();
	t1.start();
	t2.start();
	
}
}
