//2) Prompt the user to enter a 3-digit number. Print the reverse of the number 
//and the sum of the digits.

import java.util.Scanner;


public class Reverse
{
	 public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int a = sc.nextInt();
		int num = a /100;
		//System.out.println (num);
		int num1 = a % 100;
		//System.out.println (num1);
		int num2= num1 /10;
		//System.out.println(num2);
		int num3 = num1 %10;
		//System.out.println(num3);
		System.out.println(num3+""+num2+""+num);






























		 
		 
	 }
}