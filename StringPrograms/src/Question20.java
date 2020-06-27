import java.util.Scanner;

public class Question20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();

		RemvUpperCaseVow ruv = new RemvUpperCaseVow();
		ruv.getRemvUpperCaseVow(str);
	}
}

class RemvUpperCaseVow{
	void getRemvUpperCaseVow(String x) {
		System.out.println("Removing uppercase Vowels:");
		String t=x.replaceAll("[AEIOU]","");
		System.out.print(t);
	}
	
}