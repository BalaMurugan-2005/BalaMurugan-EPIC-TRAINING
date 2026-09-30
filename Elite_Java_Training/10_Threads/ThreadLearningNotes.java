import java.util.*;
import java.lang.*;
class Program {
	void p1() {
		/*
		class Mydata4 implements Runnable{
		public void run(){
		System.out.println("Thread is Running ");
		}
		}
		public class Main
		{
		public static void main(String[] args) {
		    Mydata4 t1 = new Mydata4();
		    Thread th = new Thread(t1);
		    th.start();
		    System.out.println("Main thread is Running");
		}
		}
		*/
	}
	void p2() {
		/*
		class Employee{

		}
		class Mydata4 extends Employee implements Runnable{
		public void run(){
		System.out.println("Thread is Running ");
		}
		}
		public class Main
		{
		public static void main(String[] args) {
		    Mydata4 t1 = new Mydata4();
		    Thread th = new Thread(t1);
		    th.start();
		    System.out.println("Main thread is Running");
		}
		}
		       */
	}
	void p3() {
		/*
		class Counter{
		int count=0;

		void increment() {
			count++;
		}
		}

		class MyData4 extends Thread{
		Counter c;//counter obj
		MyData4(Counter c){
			this.c=c;
		}


		public void run() {
			for(int i=0;i<10;i++) {
				c.increment();
			}
		}
		}

		public class Main {

		public static void main(String[] args) throws InterruptedException {
			Counter c = new Counter();
			MyData4 t1 = new MyData4(c);
			MyData4 t2 = new MyData4(c);
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			System.out.println(c.count);
		}

		}

		       */
	}
	void p4() {
		/*
		package LearindThread;
		class Counter{
		int count=0;
		void increment() {
			count++;
		}
		}
		class MyData4 extends Thread{
		Counter c;//counter obj
		MyData4(Counter c){
			this.c=c;
		}
		public void run() {
			try {
			for(int i=0;i<10;i++) {
				sleep(1000);
				System.out.println("Sleeping");
				c.increment();
			}
			}catch(Exception e){
				System.out.println(e);
			}
		}
		}
		public class LearingT {
		public static void main(String[] args) throws InterruptedException {
			Counter c = new Counter();
			MyData4 t1 = new MyData4(c);
			MyData4 t2 = new MyData4(c);
			t1.start();
			t2.start();
			t1.join();
			t2.join();
			System.out.println(c.count);

		}
		}
		       */
	}
	void p5() {
		/* synchronized example
		class Counter{
		int count=0;
		synchronized void increment() {
			count++;
		}
		}
		class MyData4 extends Thread{
		Counter c;//counter obj
		MyData4(Counter c){
			this.c=c;
		}
		public void run() {
			try {
			for(int i=0;i<10;i++) {
		//			sleep(1000);
		//			System.out.println("Sleeping");
				c.increment();
			}
			}catch(Exception e){
				System.out.println(e);
			}
		}
		}
		public class LearingT {
		public static void main(String[] args) throws InterruptedException {
			Counter c = new Counter();
			MyData4 t1 = new MyData4(c);
			MyData4 t2 = new MyData4(c);
			t1.start();
			t2.start();
			t1.join();
			t2.join();
			System.out.println(c.count);
		}
		}
		    */
	}
	void p6() {
		/*
		 class MyData extends Thread{

		public void run(){
		 try{
		     Thread.sleep(1000);
		 }
		 catch(InterruptedException e){

		 }
		}
		}

		public class Main {

		public static void main(String[] args) throws InterruptedException {
		    MyData t1 = new MyData();
		    System.out.println(t1.getState());
			t1.start();
			Thread.sleep(1000);
			System.out.println(t1.getState());
		}

		}

		    */
	}
	void p7() {
		/*
		class MyData{
		void display(){
		try{
		    Thread.sleep(5000);
		}
		catch(InterruptedException e){

		}
		System.out.println("Inside");
		}
		}
		public class Main
		{
		public static void main(String[] args) {
			MyData t1 = new MyData();
			Thread th = new Thread(()->{
			    t1.display();
			});
			th.start();


		}
		}

		    */
	}
	void p8() {
		/*
		class MyData extends Thread{
		public void run(){
		try{
		    Thread.sleep(5000);
		}
		catch(InterruptedException e){

		}
		System.out.println("Inside");
		}
		}
		public class Main
		{
		public static void main(String[] args) throws InterruptedException {
			MyData t1 = new MyData();
			MyData t2 = new MyData();

			t1.start();//5s
			Thread.sleep(100);
			System.out.println(t1.getState());//runnable
			t2.start();
			Thread.sleep(100);
			System.out.println(t2.getState());//timed waiting


		}
		}

		    */
	}
	void p9() {
		/*
		class MyData extends Thread{
		public void run(){
		try{
		    Thread.sleep(5000);
		}
		catch(InterruptedException e){

		}
		System.out.println("Inside");
		}
		}
		public class Main
		{
		public static void main(String[] args) throws InterruptedException {
			MyData t1 = new MyData();
			MyData t2 = new MyData();

			t1.start();//5s
			t2.start();
			Thread.sleep(100);
			System.out.println(t1.getState());//runnable
			System.out.println(t2.getState());//timed waiting


		}
		}

		    */
	}
	void p10() {
		/*

		import java.util.*;
		class MyData extends Thread{
		public void run(){
		try{
		    Thread.sleep(1000);
		}
		catch(InterruptedException e){
		}
		System.out.println("Inside");
		}
		}
		public class Main{
		public static void main(String[] args) throws InterruptedException {
			MyData t1 = new MyData();
			MyData t2 = new MyData();
			MyData t3 = new MyData();
			t1.start();//5s
		//		Thread.sleep(100);
			//runnable
			t2.start();
			t3.start();
			System.out.println(t1.getState());
		//		Thread.sleep(100);
			System.out.println(t2.getState());//timed waiting
			System.out.println(t3.getState());
		}
		}
		    */
	}
	void p11() {
		/*
		class MyData{
		synchronized void display(){
		try{
		    Thread.sleep(5000);
		}
		catch(InterruptedException e){

		}
		System.out.println("Inside");
		}
		}
		public class Main
		{
		public static void main(String[] args) {
			MyData t1 = new MyData();
			Thread th1 = new Thread(()->{
			    t1.display();
			});
			Thread th2 = new Thread(()->{
			    t1.display();
			});
			th1.start();
			th2.start();
			System.out.println(th1.getState());
			System.out.println(th2.getState());


		}
		}

		    */
		void p12() {
			/*
			class MyData extends Thread{
			public void run(){
			try{
			   Thread.sleep(5000);
			}
			catch(InterruptedException e){

			}
			System.out.println("THREAD IS RUNNING");
			}
			}
			public class Main
			{
			public static void main(String[] args) throws InterruptedException {
				MyData t1 = new MyData();
				t1.start();
				Thread.sleep(100);
				System.out.println(t1.getState());
				t1.join();//Waiting
				System.out.println("MAIN THREAD");
			}
			}


			// ThreadObj.getState();

			// new------>thread is created

			// runnable----->its running or it is ready to run

			// timed waiting--->one thread is waiting till the time is completed

			// blocked---->One thread will be wating until the running thread completes its task

			// waiting---->

			// terminated----thread is completed










			     */
		}
	}
	void p12() {
	    /*
	    void p12() {
			/*
			class MyData extends Thread{
			public void run(){
			try{
			   Thread.sleep(5000);
			}
			catch(InterruptedException e){

			}
			System.out.println("THREAD IS RUNNING");
			}
			}
			public class Main
			{
			public static void main(String[] args) throws InterruptedException {
				MyData t1 = new MyData();
				t1.start();
				Thread.sleep(100);
				System.out.println(t1.getState());
				t1.join();//Waiting
				System.out.println("MAIN THREAD");
			}
			}


			// ThreadObj.getState();

			// new------>thread is created

			// runnable----->its running or it is ready to run

			// timed waiting--->one thread is waiting till the time is completed

			// blocked---->One thread will be wating until the running thread completes its task

			// waiting---->

			// terminated----thread is completed










			     */
	    */
}
public class Main {
	public static void main(String[] args) {
		System.out.println("");
	}
}
