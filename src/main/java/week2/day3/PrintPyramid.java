package week2.day3;

public class PrintPyramid {
public static void main(String[] args) {
	for (int i = 1; i <= 6; i++) {
		// Nested Loop 1
		for (int j = 6-i; j > 0; j--) {
			System.out.print(" ");
		}
		
		// Nested Loop 2
		for (int k = 1; k <= i; k++) {
			System.out.print("* ");
		}
		
		System.out.println();
	}
}
}
