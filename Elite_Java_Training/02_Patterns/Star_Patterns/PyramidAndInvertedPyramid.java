package myfirstproject;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        ////////////////////////////////////////////////// 
        for (int i = 0; i < n; i++) { // i = 0   0<5  
            
            for (int s = 0; s < i+1; s++) {   // s=0   0<0 s=1 1<1  s=2 2<2
                System.out.print(" ");
            }
            for (int j = 0; j < n - i -1 ; j++) {  // j=0 0<5 -1 =4
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }
