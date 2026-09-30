// Method Overloading and Polymorphism Demo
// FIXED: Original tried to call in.display(5,6) where 'in' had type A.
// A only has display(int), so calling display(int,int) causes compile error.
// Correct OOP solution: use the actual runtime type (B) to call B's method.

class A {
    void display(int a) {
        System.out.println("A.display(int): " + a);
    }
}

class B extends A {
    void display(int a, int b) {
        System.out.println("B.display(int,int): " + (a + b));
    }
}

public class MethodOverloadingPolymorphism {
    public static void main(String[] args) {
        // Using type A reference — can only call A's method
        A ref = new B();
        ref.display(5);          // Works — A has display(int)

        // To call B's overloaded method, cast to B
        B bRef = new B();
        bRef.display(5, 6);      // Works — B has display(int, int)

        // Downcasting
        if (ref instanceof B) {
            ((B) ref).display(5, 6);  // Also works via downcast
        }
    }
}
