import java.util.*;

public class Employee {
	String emp_name;
	int emp_id;
	double salary;
	
	void info() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee's name, employee id and salary:");
		emp_name = sc.nextLine();
		emp_id = sc.nextInt();
		salary = sc.nextDouble();
		sc.close();
	}
	
	double raise() {
		salary = salary+((salary*10)/100);
		return salary;
	}
	
	void display() {
		System.out.println("\nName: "+emp_name+ "\nId: "+emp_id+ "\nSalary: "+salary);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee p1 = new Employee();
		p1.info();
		p1.display();
		System.out.println("Do you want to give a raise of 10%?");
		char c = sc.next().charAt(0);
		if(c == 'y') {
			p1.salary = p1.raise();
			System.out.println("New salary is: "+p1.salary);
		}
		else
			System.out.println("Salary is not increased.");
		sc.close();
	}
}
