package week2.day2;

public class SuperClass {
public static void main(String[] args) {
	// ClassName variableName = new Classname();
	BaseClass baseVariable = new BaseClass(5,4);
	
	// variableName.methodName() or variableName.classVariableName
	int number = baseVariable.a;
	System.out.println(number);
	
	baseVariable.printMyName();
	
	int result = baseVariable.addTwoNumbers(20, 10);
	System.out.println(result);
	
	baseVariable.multiply();
	
	
	
	
}
}
