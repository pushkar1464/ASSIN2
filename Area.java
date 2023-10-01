import java.util.*;

public class Area {
	private double length;
	private double breadth;
	
	void setDim(double length, double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	
	double getArea() {
		return length*breadth;
	}
	public static void main(String args[]) {
		Area a = new Area();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breadth of the rectangle: ");
		double length = sc.nextDouble();
		double breadth = sc.nextDouble();
		a.setDim(length, breadth);
		System.out.println("Area is: "+a.getArea());
		sc.close();
	}
}
