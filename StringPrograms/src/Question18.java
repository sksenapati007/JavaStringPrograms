import java.util.Scanner;

public class Question18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();

		RemvConsonants rcons = new RemvConsonants();
		rcons.getRemvConsonants(str);
	}
}

class RemvConsonants{
	void getRemvConsonants(String x) {
		System.out.println("After Removing all Consonants:");
		String t=x.replaceAll("[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]","");
		System.out.print(t);
	}
}