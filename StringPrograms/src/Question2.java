import java.util.Scanner;

public class Question2 {
	public static void main(String args[]) {
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		scan.close();

		CharAtOdd cao = new CharAtOdd(); 
		String res=cao.getCharAtEven(str);

		System.out.println("Characters at odd index are: "+res);
	}
}

class CharAtOdd{

	String getCharAtEven(String x) {

		String str1="";
		for(int j=0;j<x.length();j++) {
			if(j%2!=0) {
				str1=str1+x.charAt(j);
			}
		}
		return str1;
	}
}