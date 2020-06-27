import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();

		HalfStringRev hsr = new HalfStringRev(); 
		String res=hsr.getHalfStringRev(str);

		System.out.println("First Half of the string in reverse is: "+res);
	}
}

class HalfStringRev{

	String getHalfStringRev(String x) {

		String str1="";
		for(int j=(x.length()/2)-1; j>=0; j--) {
			str1=str1+x.charAt(j);
		}
		return str1;
	}
}