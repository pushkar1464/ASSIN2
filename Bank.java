import java.util.Scanner;
public class Bank 
{
	int acc_no;
	String acc_holder;
	int balance = 10000;
	int amount;
	Scanner sc = new Scanner(System.in);
	
	void getdata()
	{
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter the your acconunt number");
		acc_no = sc.nextInt();
		System.out.println("Enter your name");
		acc_holder = sc.next();
		System.out.println("Your current balance is:" + balance);
		//sc.close();
		
	}
	
	void  display()
	{
		System.out.println("The ");
	}
	
	public void withdraw()
	{
		
		System.out.println("Enter the amount you want to withdraw:");
		amount = sc.nextInt();
		balance -= amount;
		System.out.println("Your updated balance is : " + balance);
	}
	
	public void deposit()
	{
		System.out.println("Enter the amount you want to deposit");
		amount =sc.nextInt();
		balance += amount;
		System.out.println("Your updated balance is : " + balance);
	}
	
	public void balance()
	{
		System.out.println("balance is" + balance);
	}

	
	public static void main(String[] args)
	{
		int choice;
		System.out.println("Hello user");
		Bank b = new Bank();
		b.getdata();
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Enter your choice \n1.withdraw \n2.deposit \n3.displaybalance \n4.exit");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1: 
				b.withdraw();
				break;
			case 2:
				b.deposit();
				break;
			case 3: 
				b.balance();
				break;
			case 4:
				System.out.println("thanking for using the prog");
				break;
			default:
				System.out.println("Enter a valid choice");
			}
				
		}while(choice != 4);
		sc.close();
		
	}
}
