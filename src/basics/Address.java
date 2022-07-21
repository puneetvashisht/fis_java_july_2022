package basics;

public class Address {
	
	int houseNumber;
	String locality;
	String city;
	
	public Address() {
		
	}

	public Address(int houseNumber, String locality, String city) {
		super();
		this.houseNumber = houseNumber;
		this.locality = locality;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", locality=" + locality + ", city=" + city + "]";
	}

	public static void main(String[] args) {
		Address a1 = new Address(35, "Jangpura", "Delhi");
		System.out.println(a1);
		Address a2 = new Address(14, "Marathalli", "Bangalore");
		System.out.println(a2);
//		a1.city ="Delhi";
		
		Address a3 = new Address();
	}

}
