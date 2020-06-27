import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		scan.close();

		CharAtEvenRev caer = new CharAtEvenRev(); 
		String res=caer.getCharAtEvenRev(str);

		System.out.println("Characters at even index in reverse are: "+res);

	}

}

class CharAtEvenRev{

	String getCharAtEvenRev(String x) {

		String s="";
		for(int j=0;j<x.length();j++) {
			if(j%2==0) {
				s=s+x.charAt(j);
			}
		}
		String t="";
		for(int j=s.length()-1; j>=0; j--) {
			
				t=t+s.charAt(j);
		}
		return t;
	}
}