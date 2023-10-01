import java.util.*;

public class RectArea1{
	double length;
	double breadth;
	 RectArea1(double length, double breadth){
		 this.length=length;
		 this.breadth=breadth;
	 }
	 double getarea() {
		 double area = length*breadth;
		 return area;
	 }
	 public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the length and breadth of the rectangle: ");
		 double length = sc.nextDouble();
		 double breadth = sc.nextDouble();
		 RectArea1 ra1 = new RectArea1(length, breadth);
		 System.out.println("Area of the rectangle is: "+ra1.getarea());
		 sc.close();
	 }
}
