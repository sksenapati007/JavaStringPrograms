import java.util.Scanner;

public class Question13 {
	public static void main(String args[]) {
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();

		RemoveExtrSpaces rhs = new RemoveExtrSpaces();
		rhs.getRemvExtrSpc(str);
	}
}

class RemoveExtrSpaces{

	void getRemvExtrSpc(String x) {
		String res = x.trim();
		System.out.println("After removing spaces:"+res+"$ ");
	}
}