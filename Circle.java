//4)The radius of a circle is entered through the keyboard. Calculate the area 
//and circumference of a circle. Input the radius of a sphere. Calculate the 
//volume and surface area of a sphere

import java.util.Scanner;


public class Circle
{
	 public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius :");
		double radius = sc.nextDouble();
		double Area_Circle = 3.14 * radius * radius;
		
		System.out.println ("Area Of Circle :"+Area_Circle );
		double CircumFerance = 2 * 3.14 * radius;
		System.out.println ("CircumFerance :"+CircumFerance );

		double Volume = 4/3 * 3.14 * radius *  radius * radius;
		System.out.println("Volume Of Sphere :" +Volume);

		double Surface_Area = 4 * 3.14 * radius * radius;
		System.out.println(" Surface_Area  :" + Surface_Area );
		

		
		






























		 
		 
	 }
}