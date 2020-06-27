import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		scan.close();

		CharAtOddRev caor = new CharAtOddRev(); 
		String res=caor.getCharAtOddRev(str);

		System.out.println("Characters at odd index in reverse are: "+res);

	}

}

class CharAtOddRev{

	String getCharAtOddRev(String x) {

		String s="";
		for(int j=0;j<x.length();j++) {
			if(j%2!=0) {
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