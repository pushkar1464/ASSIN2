//import java.util.*;

public class student1 {
	String name;
	int roll_no;
	void setname1(String name) {
		this.name = name;
	}
	void setroll_no1(int roll_no) {
		this.roll_no = roll_no;
	}
	String name() {
		return name;
	}
	int roll_no() {
		return roll_no;
	}
	public static void main(String args[]) {
		student1 s = new student1();
		s.setname1("John");
		s.name();
		s.setroll_no1(22);
		System.out.println("Name of the student is: "+s.name()+"\nRoll no. of the student is: "+s.roll_no());
	}
}
