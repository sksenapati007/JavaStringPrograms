import java.util.Scanner;

public class Question53 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();
		PrintAlphaNum pan = new PrintAlphaNum(); 
		pan.getPrintAlphaNum(str);
	}

}

class PrintAlphaNum{

	void getPrintAlphaNum(String x) {

		String s="";
		for(int j=0;j<x.length();j++) {
			if(x.charAt(j)>='a' && x.charAt(j)<='z' || x.charAt(j)>='A' && x.charAt(j)<='Z' || x.charAt(j)>='0' && x.charAt(j)<='9' ) {
				s=s+x.charAt(j);
			}
		}
		System.out.println("Number of AlphaNumeric Characters in this string are: "+s);
	}
}