package week2.day2;

public class BaseClass {
	int x = 0, y = 0;
	public BaseClass(int a, int b) {
		x = a;
		y = b;
	}
	 int a = 5;
	
	public void printMyName() {
		System.out.println("My Name is Balaji");
	}
	
	public int addTwoNumbers(int a, int b) {
		return a+b;
	}
	
	public void multiply() {
		System.out.println(x*y);
	}
}
