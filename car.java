import java.util.*;
public class car 
{
	String make;
	String model;
	int year;
	
	public car(String make, String model, int year)
	{
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Make, Model, Year of the car:");
		make = sc.next();
		model = sc.next();
		year = sc.nextInt();
		sc.close();
	}
	
	public void displaydata()
	{
		System.out.println("The details of the car are as follows: \nmake "+ make + "\nmodel " + model + "\nyear " + year);
	}
	
	public void start_engine()
	{
		System.out.println("The engine is STARTED");
	}
	
	
	
	public static void main(String[] args)
	{
		car c1 = new car("BMW","S",2010);
		car c2 = new car("Lambo","SAS",2007);

		System.out.println("the details of the car1 are:");
		c1.displaydata();
		System.out.println("\n");
		System.out.println("the details of the car2 are: ");
		c2.displaydata();
		//c1.getdata();
		//c1.displaydata();
		
		//c1.start_engine();
	}
}
