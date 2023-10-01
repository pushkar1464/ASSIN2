import java.util.*;


public class Triangle {
	double a;
	double b;
	double c;
	double base;
	double height;
	
	void getdata(double a, double b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	double peri() {
		double peri = a+b+c;
		return peri;
	}

	double area() {
		double s = (a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}
	public static void main(String args[]) {
		Triangle t = new Triangle();
		Scanner sc = new Scanner(System.in);
		
		t.getdata(3, 4, 5);
		System.out.println("Perimeter is: "+t.peri());
				
		System.out.println("Area is: "+t.area());
		sc.close();
	}
}
