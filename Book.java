import java.util.*;
public class Book 
{
	String title;
	String author;
	int pubyear;
	
	public void book()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Title of the book");
		title = sc.next();
		System.out.println("Enter the Author of the book");
		author = sc.next();
		System.out.println("Enter the Publication year of the book");
		pubyear = sc.nextInt();
		sc.close();
	}
	public void display()
	{
		System.out.println("The book details are");
		System.out.println("Title:"+ title+"\nAuthor:"+author+"\npublication year:"+pubyear);
	
	}
	public static void main(String[] args)
	{
	
	
		Book book =new Book();
		book.book();
		book.display();
		}
}
