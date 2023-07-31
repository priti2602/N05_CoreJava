/*Pratik is so much interested in gardening and hence he plants more trees
 * in his garden.He plants trees in a rectangular fashion with the order of rows and
 * columns and numbers the trees in a row wise order.He planted the Mango tree
 * only in the 1st row,1st column and last column.So,given the tree no.
 * and rows and columns your task is to find out whether the given tree is Mango tree or not
 * n=5,t=11(tree no.)
 */



package org.tnsif.challenges;
import java.util.Scanner;
public class MangoTreeExecutor {
	
	static void ismangotree (int n, int t)
	{
		if(t%n==0 || t%n==1 || t<=n)
		{
			System.out.println("Mango tree");
		}
		
		else
		{
			System.out.println("Not a mango tree");
		}
	}

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		 System.out.println("Enter the value of n and t :");
		
		 int n=s.nextInt();
		 int t=s.nextInt();
		ismangotree(n,t);
		
	}

}