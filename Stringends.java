package main;
import java.util.*;

public class Stringends {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.print("Enter a string: "); 
		String a= in.nextLine();
		System.out.print("Enter a string: ");
		String b= in.nextLine();
		if(a.endsWith(b))
		{	System.out.println("TRUE");
		
		}
		else{
			System.out.println("FALSE");
		}
		// TODO Auto-generated method stub

	}

}
