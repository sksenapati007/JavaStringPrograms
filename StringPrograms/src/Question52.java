import java.util.Scanner;

public class Question52 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();
		PrintAlpha ca = new PrintAlpha(); 
		ca.getPrintAlpha(str);
	}

}

class PrintAlpha{

	void getPrintAlpha(String x) {

		String s="";
		for(int j=0;j<x.length();j++) {
			if(x.charAt(j)>='a' && x.charAt(j)<='z' || x.charAt(j)>='A' && x.charAt(j)<='Z') {
				s=s+x.charAt(j);
			}
		}
		System.out.println("Number of Alpha Characters in this string are: "+s);
	}
}