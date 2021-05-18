package week3.day1;

public class LearnMultiDimensionalArray {
public static void main(String[] args) {
	String[][] tt = {{"Lab","Selenium","Java"},
					 {"Lab","Java","Selenium"},
					 {"Selenium","Java","Lab"},
					 {"Java","Lab","Selenium"},
					 {"Selenium","Lab","Java"}};
	
	for (int i = 0; i < tt.length; i++) {
		for (int j = 0; j < tt[i].length; j++) {
			System.out.print(tt[i][j]+"     ");
		}
		System.out.println();
		
	}
	
}
}
