//import java.util.*;

public class student2 {
	int rollno;
	String phoneno;
	String address;
	
	void setStudent2(int rollno, String phoneno, String address) {
		this.rollno = rollno;
		this.phoneno = phoneno;
		this.address = address;
	}
	void display() {
		System.out.println("Roll no. is: "+rollno);
		System.out.println("Phone is: "+phoneno);
		System.out.println("Address is: "+address);
	}
	public static void main(String args[]) {
		student2 sam = new student2();
		sam.setStudent2(23,"7894561230", "Andheri West, Maharashtra.\n");
		sam.display();
		student2 john = new student2();
		john.setStudent2(33,"9347206793", "Thane East, Maharashtra.");
		john.display();
	}
}
