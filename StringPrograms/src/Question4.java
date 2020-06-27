import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();

		SecondHalfString hs = new SecondHalfString(); 
		String res=hs.getHalfString(str);

		System.out.println("Second Half of the string is: "+res);
	}
}

class SecondHalfString{

	String getHalfString(String x) {

		String str1="";
		for(int j=x.length()/2; j<x.length(); j++) {
				str1=str1+x.charAt(j);
		}
		return str1;
	}
}