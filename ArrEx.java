package com.infinite.exhn;

public class ArrEx {
public static void main(String[] args) {
	int[] a={12,45};
	try {
		a[10]=90;
	}
	   catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Array size is small.....");
	} 
	catch (Exception e)
	{
		e.printStackTrace();
	}
 }
}
