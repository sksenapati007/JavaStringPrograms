import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		scan.close();
		CharAtEven cae = new CharAtEven(); 
		String res=cae.getCharAtEven(str);
		
		System.out.println("Characters at even index are: "+res);
		
	}

}

class CharAtEven{
	
	String getCharAtEven(String x) {
		
		String s="";
		for(int j=0;j<x.length();j++) {
			if(j%2==0) {
				s=s+x.charAt(j);
			}
		}
		return s;
	}
}