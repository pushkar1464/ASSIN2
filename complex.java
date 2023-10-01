//import java.util.*;

public class complex {
	int real, real1;
	int imaginary, imaginary1;
	void setdata(int real, int real1, int imaginary, int imaginary1) {
		this.real = real;
		this.imaginary = imaginary;
		this.real1 = real1;
		this.imaginary1 = imaginary1;
	}
	void add() {
		int add = real+real1;
		int add1 = imaginary+imaginary1;
		System.out.println("Addition is: "+add+"+"+add1+"i");
	}
	void sub() {
		int sub = real-real1;
		int sub1 = imaginary-imaginary1;
		System.out.println("\nSubtraction is: "+sub+"+"+sub1+"i");
	}
	void mul() {
		int mul = ((real*real1)-(imaginary*imaginary1));
		int mul1 = (real*imaginary1)+(real1-imaginary);
		System.out.println("\nMultiplication is: "+mul+"+"+mul1+"i");
	}
	public static void main(String args[]) {
		complex cx = new complex();
		cx.setdata(7, 4, 2, 3);
		cx.add();
		cx.sub();
		cx.mul();
	}
}
