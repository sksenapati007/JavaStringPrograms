import java.util.Scanner;

public class Question25 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();

		RemvAlphaNumChars ranc = new RemvAlphaNumChars();
		ranc.getRemvAlphaNumChars(str);
	}
}

class RemvAlphaNumChars{
	void getRemvAlphaNumChars(String x) {
		System.out.println("After Removing all AlphaNumeric Characters:");
		String t=x.replaceAll("[A-Za-z0-9]","");
		System.out.print(t);
	}
}