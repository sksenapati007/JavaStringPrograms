import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();

		RemvNumeric rnum = new RemvNumeric();
		rnum.getRemvNumeric(str);
	}
}

class RemvNumeric{
	void getRemvNumeric(String x) {
		System.out.println("After removing Numeric digits letters:");
		String t=x.replaceAll("[0-9]","");
		System.out.print(t);
	}
}