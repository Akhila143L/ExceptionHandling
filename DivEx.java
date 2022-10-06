package com.infinite.exhn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivEx {
public static void main(String[] args) {
	int a,b,c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 2 numbers  ");
	try {
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
System.out.println("Division is: " +c);
	}
	catch(ArithmeticException e){
		System.out.println("Division by Zero impossible...");
	}
	catch(InputMismatchException e){
		System.out.println("String cannot be converted as integer...");
	}
	catch (Exception e) {
	
		e.printStackTrace();
	
	
}
	finally{
		System.out.println("Program from Infinite Training....");
	}
}
}
