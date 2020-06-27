import java.util.Scanner;

public class Question19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();

		RemvLowerCaseVow rlv = new RemvLowerCaseVow();
		rlv.getRemvLowerCaseVow(str);
	}
}

class RemvLowerCaseVow{
	void getRemvLowerCaseVow(String x) {
		System.out.println("Removing lowercase Vowels:");
		String t=x.replaceAll("[aeiou]","");
		System.out.print(t);
	}
	
}