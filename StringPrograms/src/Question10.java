import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		scan.close();
		MiddleChar mc = new MiddleChar(); 
		String res=mc.getMiddleChar(str);
		
		System.out.println("Character at Middle of the string: "+res);
		
	}

}

class MiddleChar{
	
	String getMiddleChar(String x) {
		
		String s="";
		int j= x.length()/2;
				s+=x.charAt(j);
		return s;
	}
}