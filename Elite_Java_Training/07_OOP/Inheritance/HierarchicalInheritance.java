/*
class Muutltiple_Inhertence{
    class A{
    int a=20000;
    void printData(int a){
        //System.out.println(a);
    }
}
class B extends A{
    B(){
        //System.out.println(a);
    }
    int b=10000000;
    void printData(int a,int b){
        //System.out.println(a+b);
    }
}
class C extends B{
    C(){
    //System.out.println(a);
    }
}
}
class herarchical_Inheritence{
    class A{
    int a=500;
}
class B extends A{
    int b =50;
}
class C extends A{
    int c=90;
}
class D extends B{
    int d=30;
}
class E extends B{
    int e=100;
}
class F extends C{
    int f=20;
}
}
class Object_Binding{
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
}
*/

class A{
    int a=500;
}
class B extends A{
    int b =50;
}
class C extends A{
    int c=90;
}
class D extends B{
    int d=30;
}
class E extends B{
    int e=100;
}
class F extends C{
    int f=20;
}
public class Main
{
	public static void main(String[] args) {
		D d = new D();
		F f = new F();
		System.out.println("d ="+d.d);
		System.out.println("b ="+d.b);
		System.out.println("a ="+d.a);
		System.out.println("c ="+f.c);
		System.out.println("f ="+f.f);
		System.out.println("a =" + f.a);
	}
}