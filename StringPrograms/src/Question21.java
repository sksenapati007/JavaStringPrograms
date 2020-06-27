import java.util.Scanner;

public class Question21 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();

		RemvLConsonants rlcons = new RemvLConsonants();
		rlcons.getRemvLConsonants(str);
	}
}

class RemvLConsonants{
	void getRemvLConsonants(String x) {
		System.out.println("After Removing all lowercase Consonants:");
		String t=x.replaceAll("[bcdfghjklmnpqrstvwxyz]","");
		System.out.print(t);
	}
}