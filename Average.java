import java.util.*;

public class Average {
	double calculate(int a, int b, int c) {
		double avg = (a+b+c)/3;
		return avg;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Average av = new Average();
		System.out.println("Average of the entered 3 numbers is: "+av.calculate(a, b, c));
		sc.close();
	}
}
