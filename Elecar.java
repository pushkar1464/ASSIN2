import java.util.*;
class car1
{
	String make;
	String model;
	int year;
	
	public car1(String make, String model, int year)
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
}





public class Elecar extends car1
{
	int mileage;
	int fuel_level;
	public Elecar(String make, String model, int year) {
		super(make, model, year);
	}

	public void start_engine()
	{
		System.out.println("THe Electric motor started");
	}
	
	void mileage(int mileage)
	{
		System.out.println("Mileage is:"+ mileage);
	}
	
	void fuel_level(int fuel_level)
	{
		System.out.println("Fule level is:" + fuel_level);
	}
	
	public static void main(String[] args)
	{
		int batterysize=60;
		Elecar ec = new Elecar("BMW","SS",2002);
		
		System.out.println("the details of the car1 are:");
		ec.displaydata();
		System.out.println("\n");
		System.out.println("THe battery size is:" + batterysize);
		ec.start_engine();
		ec.mileage(45);
		ec.fuel_level(60);
	}
}