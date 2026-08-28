import java.util.*;
class A{
    void display(int a){
        System.out.println(a);
    }
}
class B extends A{
    void display(int a,int b){
        System.out.println(a+b);
    }
}
public class Main{
	public static void main(String[] args) {
	   A in = new B();
	   in.display(5,6);
	}
}
