class Add{
	int feet;
	int inch;
	
	public Add(int feet, int inch) {
//		super();
		this.feet = feet;
		this.inch = inch;
	}
	public Add addition(Add other) {
		
		int newfeet = this.feet + other.feet;
		int newinch = this.inch + other.inch;
		
		if (newinch>=12) {
			newfeet ++;
			newinch -=12;
		}
		
		return new Add(newfeet, newinch);
	}

public static class AddDistance {

	public static void main(String[] args) {
	
		Add a4=new Add(5, 10);
		Add a2=new Add(6, 10);
		
		Add a3= a4.addition(a2);
		System.out.println("Addition result is : "+a3.feet+" feet "+a3.inch+" inch.");
		
	}
		
	}

}