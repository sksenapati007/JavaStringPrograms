import java.util.Scanner;

public class Question64 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		scan.close();
		ABCVowels cvol = new ABCVowels(); 
		cvol.getABCVowels(str.toLowerCase());
	}

}

class ABCVowels{
	
	void getABCVowels(String x) {
		
		for(int j=0;j<x.length();j++) {
				if(x.charAt(j)=='a'||x.charAt(j)=='e'||x.charAt(j)=='i'||x.charAt(j)=='o'||x.charAt(j)=='u') {
					x=x.replace(""+x.charAt(j), "ABC");
				}
		}
		System.out.println("ABC instead of Vowels in this string: "+x);
	}
}