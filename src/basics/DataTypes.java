package basics;

public class DataTypes {

	public static void main(String[] args) {
		byte age = (byte) 13;
		// upcasting .. is natural
		int x = age;
		System.out.println(x);
		
		int y =34;
		
		// downcasting.. involves explicit cast
		byte b = (byte)y;

	}

}
