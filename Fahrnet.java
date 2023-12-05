//1) Temperature of a city in Fahrenheit degrees is input through the 
//   keyboard. Write a program to convert this temperature into centigrade [ 
//   c/5=(f-32)/9].

import java.util.Scanner;


public class Fahrnet
{
	 public static void main(String[] args)
	 {
		 Scanner sc = new Scanner(System.in);
		 double Fahrenheit = sc.nextDouble();
		 double centigrate =(Fahrenheit - 32) / 9  * 5; 
		 System.out.println (centigrate); 
		 
		 
	 }
}