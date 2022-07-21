package basics;

public class Test {

	// member variables
	int i;
	
	// methods
	void printI(){
		System.out.println(this.i);
	}
	
	public static void main(String [] args) {
		
		int age = 19;
		
		
		do {
			System.out.println("not allowed");
			age++;
		}while(age < 18);
		
		while (age < 18) {
			System.out.println("not allowed");
//			age++;
		}
		
		System.out.println("allowed");
		
//		switch(age) {
//		case age> 18: s
//		}
		
//		if(age> 18) {
//			
//		}
//		else if(age == 18) {
//			System.out.println("also allowed..");
//		}
//		else {
//			System.out.println("allowed");
//		}
		
//		
//		for(; ; ) {
//			System.out.println("test works...");
//		}
		
	}
	
}
