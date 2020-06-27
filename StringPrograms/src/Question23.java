import java.util.Scanner;

public class Question23 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();

		RemvSpecialChars rspc = new RemvSpecialChars();
		rspc.getRemvSpecialChars(str);
	}
}

class RemvSpecialChars{
	void getRemvSpecialChars(String x) {
		System.out.println("After Removing all Special Characters:");
		String t=x.replaceAll("[^a-zA-Z0-9_-]","");
		System.out.print(t);
	}
}