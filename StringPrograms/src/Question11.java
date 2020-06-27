import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();

		RevHalfString rhs = new RevHalfString();
		String res[]=str.split(" ");
		rhs.getHalfStringRev(res);
	}
}

class RevHalfString{

	
	void getHalfStringRev(String x[]) {
		System.out.println("Half of the string in reverse is:");
		for(int j=(x.length/2)-1; j>=0; j--) {
			System.out.print(x[j]+ " ");
		}
	}
}