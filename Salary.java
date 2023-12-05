//2) Write a program to receive the salary and display bonus 17% of his/her 
//salary.

import java.util.Scanner;


public class Salary

{
	 public static void main(String[] args)
	 {
		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Salary :");
		 int Salary = sc.nextInt();
		 int bonus = Salary * 17 /100; 
		 System.out.println ("Bonus :" +bonus); 
		 
		 
	 }
}