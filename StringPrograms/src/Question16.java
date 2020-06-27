import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();

		RemvUppercase ruc = new RemvUppercase();
		ruc.getRemvUppercase(str);
	}
}

class RemvUppercase{
	void getRemvUppercase(String x) {
		System.out.println("After removing Uppercase letters:");
		String t=x.replaceAll("[A-Z]","");
		System.out.print(t);
	}
}