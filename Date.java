//5) Write a program to receive a date, month and year. Display dd/mm/yy format.

import java.util.Scanner;


public class Date 
{
	 public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day :");
		int day = sc.nextInt();
		int day1 = day / 10;
		//System.out.println(day1);
		int day2 = day % 10 ;
		//System.out.println(day2);
		//System.out.println("--------------------------");
		
		System.out.println("Enter the Month :");
		int Month = sc.nextInt();
		int mon1 = Month / 10;
		//System.out.println(mon1);
		int mon2 = Month % 10;
		//System.out.println(mon2);
		//System.out.println("--------------------------");
		
		System.out.println("Enter the Year :");
		int year = sc.nextInt();
		int yr1 = year /100;
		//System.out.println( yr1);
		int yr2 = year %100;
		//System.out.println( yr2);
		
		//System.out.println("--------------------------");
		System.out.println ( "Today's Date :"+day1+""+day2+"/"+mon1+""+mon2+"/"+yr2);
		
		

		
		
		
		

		
		






























		 
		 
	 }
}