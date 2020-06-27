import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();

		RemoveSpaces rhs = new RemoveSpaces();
		String res[] = str.split(" ");
		rhs.getRemvSpc(res);
	}
}

class RemoveSpaces{

	void getRemvSpc(String x[]) {
		System.out.println("After removing spaces:");
		for(int i=0; i<x.length;i++) {
			System.out.print(x[i]);
		}
		
	}
}