import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();

		RemvLowercase ruc = new RemvLowercase();
		ruc.getRemvLowercase(str);
	}
}

class RemvLowercase{
	void getRemvLowercase(String x) {
		System.out.println("After removing Lowercase letters:");
		String t=x.replaceAll("[a-z]","");
		System.out.print(t);
	}
}