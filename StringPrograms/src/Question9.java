import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		scan.close();
		CharMultiplesOf3 cm = new CharMultiplesOf3(); 
		String res=cm.getCharMultiplesOf3(str);
		
		System.out.println("Characters at index (multiples of 3) are: "+res);
		
	}

}

class CharMultiplesOf3{
	
	String getCharMultiplesOf3(String x) {
		
		String s="";
		for(int j=0;j<x.length();j++) {
			if(j%3==0) {
				s=s+x.charAt(j);
			}
		}
		return s;
	}
}