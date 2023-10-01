import java.util.*;
public class Rectangle 
{
	public void area(int l,int b)
	{
		
		int result = l * b;
		System.out.println("The area of the rectangle is\n" + result);
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("To get the area of the reactangle Enter the dimensions");
		System.out.println("Enter the length");
		int length = sc.nextInt();
		System.out.println("Enter the breadth");
		int breadth = sc.nextInt();
		
		Rectangle rect = new Rectangle();
		rect.area(length, breadth);
		
		sc.close();
		
	}
}
