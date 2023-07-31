package org.tnsif.challenges;

import java.util.Scanner;

/*there are n people standing in a circle waiting to be executed.
 the counting out begins at some point in the circle and proceeds 
 around the circle in a fixed direction.In each step a certain no of 
 people are skipped and the next person is executed.The elimination 
 proceeds around the circle(which is becoming smaller and smaller as the executed
 people are removed),until only the last person remains,who is given freedom
 Given the total no of person n and a number k which indicates that k-1 person 
 are skipped and the k th person is killed in a circle.The task is to chose the person 
 in the initial circle that survives.
  */
public class Circlechallenge {
	static int survive(int n, int k)
	{
		if (n==1)
		return 1;
		else 
			return(survive (n-1,k)+k-1)%n+1;

	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		System.out.println(survive(n,k));
		

	}

}
