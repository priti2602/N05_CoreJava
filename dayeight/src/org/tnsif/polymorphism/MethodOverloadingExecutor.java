//program to demonstrate on compile time polymorphism

package org.tnsif.polymorphism;

import java.util.Scanner;

class Bollywood
{
	String str1,str2,str3;
	//method overloading based on changing the number of arguments
	static void display(String str1,String str2)
	{
		System.out.println(str1+" Loves "+str2);
	}
	
	static void display(String str1,String str2,String str3)
	{
		System.out.println(str1+" Loves "+str2+" as well as "+str3);
	}
}
//driver class
public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		System.out.println("Enter the three strings");
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		String str3=s.next();
		Bollywood.display(str1, str2);
		Bollywood.display(str1, str2, str3);
		
	}

}
