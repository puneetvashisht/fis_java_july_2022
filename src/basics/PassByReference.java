package basics;


class Number{
	public Number(int x) {
		this.x = x;
	}
	int x;
}

public class PassByReference {
	
	public static void m1(Number number) {
		number.x= number.x + 3;
		System.out.println(number.x);
	}

//	public static void m1(int x) {
//		x = x + 3;
//		System.out.println(x);
//	}

	public static void main(String[] args) {
//		int y = 3;
		
		Number y = new Number(3);
		m1(y);
		
		System.out.println("y is: " + y.x);

	}

}
