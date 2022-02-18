package methodspractice;

public class overloadMethod {
	final double PI =3.14;
	
	public void area (int b, int h) {
		System.out.println("Area of a Triangle: " + (0.5 * b * h));
	}
	public void area (int r) {
		System.out.println("Area of a Circle: " + (PI * r * r));
	}
	

	public static void main(String[] args) {
		overloadMethod ob=new overloadMethod();
	       ob.area(10,12);
	       ob.area(5);  
	}

}
