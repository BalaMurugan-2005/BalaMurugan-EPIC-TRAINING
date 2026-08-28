class Customer{
    String cusName;//Dharaneesh
    //constructor
    Customer(String name){
        this.cusName = name;
    }
}


public class Main
{
    Main(){
        
    }
	public static void main(String[] args) {
		Customer cus = new Customer("Dharaneesh");
		System.out.println(cus.cusName);
	}
}


/*
import java.util.Scanner;

public class Main
{
    //declaration
    void display(int a){
        System.out.println(a);
    }
    int myData(int a,int b,String c){
         System.out.println(c);
        return a+b;
    }
    
    
    
    
    
	public static void main(String[] args) {
	        Main m = new Main();
	        //call
	        m.display(1000);
	        System.out.println(m.myData(10,20,"Dharaneesh"));
	        
	}
}

*/
