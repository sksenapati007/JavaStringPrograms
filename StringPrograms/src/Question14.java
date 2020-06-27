import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();

		RemvVowels rhs = new RemvVowels();
		rhs.getRemvVowels(str);
	}
}

class RemvVowels{
	void getRemvVowels(String x) {
		System.out.println("Removing Vowels:");
		String t=x.replaceAll("[AEIOUaeiou]","");
		System.out.print(t);
	}
	
}