package Multithreading;
//import java.util.*;

public class Multi1 extends Thread {
public void run() {
	
	try {
		for(int i=1;i<=5;i++) {
			System.out.println("ramesh");
		}
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	try {
	Thread.sleep(1000);
	}catch(InterruptedException e) {
	System.out.println("catch block");
	System.out.println(e);
	}
	System.out.println("thread is running1");
}
	public static void main(String[] args) throws InterruptedException {
		Multi1 m=new Multi1();
		m.start();
		System.out.println("thread is running");

		for(int i=1;i<=5;i++) {
			System.out.println("hari");		
			Thread.sleep(500);

		}

	}

}
