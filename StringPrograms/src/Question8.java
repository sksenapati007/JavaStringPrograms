import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();

		SecondHalfStringRev shsr = new SecondHalfStringRev(); 
		String res=shsr.getHalfStringRev(str);

		System.out.println("Second Half of the string in reverse is: "+res);
	}
}

class SecondHalfStringRev{

	String getHalfStringRev(String x) {

		String str1="";		
		for(int j=x.length()-1;j>=x.length()/2;j--) {
			str1=str1+x.charAt(j);
		}
		return str1;
	}
}