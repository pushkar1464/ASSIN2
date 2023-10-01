public class rectarea {
	double length;
	double breadth;
	double area;
	
	void setpara(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	double area() {
		area = length*breadth;
		return area;
	}
	
	public static void main(String args[]) {
		rectarea ra = new rectarea();
		ra.setpara(4, 5);
		System.out.println("Area with length and breadth 4, 5 is: "+ra.area());
		
		ra.setpara(5, 8);
		System.out.println("\nArea with length and breadth 5, 8 is: "+ra.area());
	}
}
