import java.util.Scanner;

public class Question60 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();
		PrintUCLC ccons = new PrintUCLC(); 
		ccons.getPrintUCLC(str);
	}

}

class PrintUCLC{

	void getPrintUCLC(String x) {
		
		String s="";
		String t="";
		for(int j=0;j<x.length();j++) {
			if(x.charAt(j)=='a'||x.charAt(j)=='e'||x.charAt(j)=='i'||x.charAt(j)=='o'||x.charAt(j)=='u' &&  x.charAt(j)=='A'||x.charAt(j)=='E'||x.charAt(j)=='I'||x.charAt(j)=='O'||x.charAt(j)=='U') {
				s=(s+x.charAt(j)).toLowerCase();
			}
			else if(x.charAt(j)>'a' && x.charAt(j)<='z') {
				t=(t+x.charAt(j)).toUpperCase();
			}
			else {
				;
			}
		}
		System.out.println("All Consonants to Uppercase & Vowels to LowerCase in this string: "+s);
		System.out.println("All Consonants to Uppercase & Vowels to LowerCase in this string: "+t);
	}
}