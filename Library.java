import java.util.*;
public class Library{
	private String book;
	public String getbook() {
		return book; 
	}
	Library(String book){
		this.book = book;
	}
	public static void main(String[] args) {
		List<Library> library = new ArrayList<Library>();
			library.add(new Library("Book1"));
			library.add(new Library("Book2"));
			library.add(new Library("Book3"));
			library.add(new Library("Book4"));
			
			System.out.println("Choose options: \n1.Print the book list: \n2.Add the book to the list");
			Scanner sc = new Scanner(System.in);
			
			int c = sc.nextInt();
			switch(c) {
			case 1: System.out.println("Printing the book list");
			for(Library lib:library) {
				System.out.println("book 1 name is: "+(String)lib.book);
			}
			break;

			case 2: System.out.println("Add book to the list");
			library.add(new Library("book6"));
			for(Library lib:library) {
				System.out.println("Book name is: "+(String)lib.book);
			}
			break;
	}
}
}