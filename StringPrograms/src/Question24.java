import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();

		RemvAlphaChars rac = new RemvAlphaChars();
		rac.getRemvAlphaChars(str);
	}
}

class RemvAlphaChars{
	void getRemvAlphaChars(String x) {
		System.out.println("After Removing all Alpha and special Characters:");
		String t=x.replaceAll("[^0-9_-]","");
		System.out.print(t);
	}
}