import java.util.*;
class program {
	/*
	void p1() {
		class Mt extends Thread {
			public void run() {
				System.out.println("Thread is running");
			}
		}
		public class Main
		{
			public static void main(String[] args) {
				Mt in = new Mt();
				in.start();
			}
		}
	}
	*/
	void arraowFunctuon() {
		Thread t1 = new Thread(() -> {
			System.out.println("Hello");
		});
		Thread t2 = new Thread(() -> {
			System.out.println("world");
		});
		System.out.println("One");
		t1.start();
		t2.start();
		System.out.println("Two");
	}
	/*
	void p3(){
	    class Mt extends Thread {
			public void run() {
				for(int i=0;i<5;i++){
				    System.out.println("first thred"  + i);
				    try{
				        Thread.sleep(1000);

				    }
				    catch(Exception e){
				        System.out.println(e);
				    }
				}
			}
		}
	class T2 extends Thread {
	public void run(){

	    for(int i=0;i<10;i++){
	        System.out.println("Second thread" + i);
	        try{
	            Thread.sleep(500);
	        }
	        catch(Exception e){
	            System.out.println(e);
	        }
	    }

	}
	}
	public class Main
	{
	public static void main(String[] args)  throws InterruptedException{
		Mt t1 = new Mt();
		T2 t2 = new T2();
		t1.start();
		t2.start();
		t1.join();
		t2.join();


	}
	}
	}
	void p4(){
	    class Counter{
	int count=0;
	public void incrementCount() {
		count++;
	}
	}

	class MyThread extends Thread{
	Counter count;//obj
	MyThread(Counter count){
		this.count = count;
	}
	public void run(){
		for(int i=0;i<10;i++) {
			try{
			    Thread.sleep(1000);
			}
			catch(Exception e){

			}
			count.incrementCount();
		}
	}
	}


	public class Main {

	public static void main(String[] args) {
		Counter c = new Counter();//#100
		MyThread t1 = new MyThread(c);//#100 -->10-->count=10
		MyThread t2 = new MyThread(c);//#100 -->10-->count=20
		t1.start();
		t2.start();
	    System.out.println(c.count);
	}

	}
	}
	void p5(){
	    class Counter{
	int count=0;
	public void incrementCount() {
		count++;
	}
	}
	class MyThread extends Thread{
	Counter count;//obj
	MyThread(Counter count){
		this.count = count;
	}
	public void run(){
		for(int i=0;i<10;i++) {
			count.incrementCount();
		}
	}
	}


	public class Main {

	public static void main(String[] args) {
		Counter c = new Counter();
		MyThread t1 = new MyThread(c);
		MyThread t2 = new MyThread(c);
		t1.start();
		t2.start();
	    System.out.println(c.count);
	}
	}
	}
	*/
}
public class Main {
	public static void main(String[] args) {
	    
	}
}
/*
class sysInfo{
    void p1(){
        Process p = Runtime.getRuntime().exec("cat /etc/os-release");

        java.io.InputStream input = p.getInputStream();

        int c;

        while ((c = input.read()) != -1) {
            System.out.print((char) c);
        }

        Runtime runtime = Runtime.getRuntime();

        System.out.println("===== CPU INFORMATION =====");

        System.out.println("Available CPU Cores: "
                + runtime.availableProcessors());

        System.out.println("Operating System: "
                + System.getProperty("os.name"));

        System.out.println("OS Version: "
                + System.getProperty("os.version"));

        System.out.println("Architecture: "
                + System.getProperty("os.arch"));

        System.out.println("Java Version: "
                + System.getProperty("java.version"));

        System.out.println("JVM Name: "
                + System.getProperty("java.vm.name"));

        System.out.println("JVM Version: "
                + System.getProperty("java.vm.version"));

        System.out.println("Maximum JVM Memory: "
                + runtime.maxMemory() / (1024 * 1024) + " MB");

        System.out.println("Total JVM Memory: "
                + runtime.totalMemory() / (1024 * 1024) + " MB");

        System.out.println("Free JVM Memory: "
                + runtime.freeMemory() / (1024 * 1024) + " MB");
    }
}
*/
