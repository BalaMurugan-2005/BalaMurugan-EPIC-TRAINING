package myfirstproject;
import java.io.*;
import java.util.*;

public class HelloWorld{
	public static void main(String[] args) {
		int a = 2;
		int b=3;
		a= a++ + a-- -b++ + --a; // 3 + 2 - 2 + 1 //4
		a+= b++ - b++ +b--; // 3 - 4 + 3 // 4
		
		/*
		 * a=8 
		 * b=5
		 *  int c; 9 + 9 + 9 + 5 + 10 + 8 + 5 + 8 + 5 + 5 * 6 * 7  // 210 +68 / 63 / 
		 * */
		int c = ++a + ++b - b-- + a++ + a + b++ + a-- + --a + b-- + a + b + b-- * b++ *b;
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
	}
}








