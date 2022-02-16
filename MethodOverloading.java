package main;
import java.util.*;

public class MethodOverloading {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter Side of square : ");
		float a=in.nextFloat();
		System.out.println("Area of square =   "+area(a));
		System.out.println("Enter length and breath of rectagle : ");
		float l=in.nextFloat();
		float b=in.nextFloat();
		System.out.println("Area of rectangle =   "+area(l,b));
		System.out.println("Enter radius of circle : ");
		double r=in.nextDouble();
		System.out.println("Area of circle =   "+area(r));
		
		// TODO Auto-generated method stub

	}
	
	static float area(float a)
	{ return a*a;
	
	}
	
	static float area(float l, float b)
	{
		return l*b;
	}
	
	static double area(double r)
	{
		return 3.14*r*r;
	}

}
