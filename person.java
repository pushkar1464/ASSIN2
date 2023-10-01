import java.util.*;
public class person 
{
	String name;
	int age;
	String gender;
	
	public void peron()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the person");
		name = sc.next();
		System.out.println("Enter the age of the person");
		age = sc.nextInt();
		System.out.println("Enter the gender of the person");
		gender = sc.next();
		sc.close();
	}
	
	public void display()
	{
		System.out.println("The name of the person entered is \n" + name + "\nThe age of the person entered is \n"+age+ "\nThe gender of the person is\n"+gender);
	}
	
	public static void main(String[] args)
	{
		person p = new person();
		p.peron();
		p.display();
		
	}
}
