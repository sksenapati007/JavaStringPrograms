import java.util.Scanner;

public class Question22 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();

		RemvUConsonants rucons = new RemvUConsonants();
		rucons.getRemvUConsonants(str);
	}
}

class RemvUConsonants{
	void getRemvUConsonants(String x) {
		System.out.println("After Removing all uppercase Consonants:");
		String t=x.replaceAll("[BCDFGHJKLMNPQRSTVWXYZ]","");
		System.out.print(t);
	}
}