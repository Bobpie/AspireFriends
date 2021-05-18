package week2.day3;

public class LearnSwitch {
	public static void main(String[] args) {
		String ticket = "First Class";
		switch (ticket) {
		default:
			System.out.println("Invalid Seat type");
			break;
		case "First Class":
			System.out.println("Rs. 150");
			break;
		case "Balcony":
			System.out.println("Rs. 200");
			break;
		case "Second Class":
			System.out.println("Rs. 120");
			break;
		
		
		}
	}
}
