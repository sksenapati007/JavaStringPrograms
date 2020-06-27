import java.util.Scanner;

public class Question3334 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();
		CountUCLCVowels cvol = new CountUCLCVowels(); 
		cvol.getCountUCLCVowels(str);
	}

}

class CountUCLCVowels{

	void getCountUCLCVowels(String x) {

		int uccount=0,lccount=0;
		for(int j=0;j<x.length();j++) {
			if(x.charAt(j)=='a'||x.charAt(j)=='e'||x.charAt(j)=='i'||x.charAt(j)=='o'||x.charAt(j)=='u') {
				lccount++;
			}
			if(x.charAt(j)=='A'||x.charAt(j)=='E'||x.charAt(j)=='I'||x.charAt(j)=='O'||x.charAt(j)=='U') {
				uccount++;
			}
		}
		System.out.println("Number of LowerCase Vowels in this string are: "+lccount);
		System.out.println("Number of UpperCase Vowels in this string are: "+uccount);
	}
}