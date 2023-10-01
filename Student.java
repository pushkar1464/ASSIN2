import java.util.*;
class Student 
{
	String name;
	int age;
	char grade;
	
	public void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details of the Student as \n1.name \n2.age \n3.grade");
		name = sc.next();
		age = sc.nextInt();
		grade = sc.next().charAt(0);
		sc.close();
	}
	
	void displaydata()
	{
		System.out.println("the details of the student is:");
		System.out.println("Name" + name + "\tage" + age + "\tgrade" + grade);
	}
	
	public static void main(String[] args)
	{
		Student st1 = new Student();
		st1.getdata();
		st1.displaydata();
		
		Student st2 = new Student();
		st2.getdata();
		st2.displaydata();
		
		Student st3 = new Student();
		st3.getdata();
		st3.displaydata();
		
	}

}
