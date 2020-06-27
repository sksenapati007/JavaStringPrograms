import java.util.Scanner;

public class Question69 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		scan.close();
		ABCLCVowels cvol = new ABCLCVowels(); 
		cvol.getABCLCVowels(str);
	}

}

class ABCLCVowels{
	
	void getABCLCVowels(String x) {
		
		for(int j=0;j<x.length();j++) {
				if(x.charAt(j)=='a'||x.charAt(j)=='e'||x.charAt(j)=='i'||x.charAt(j)=='o'||x.charAt(j)=='u') {
					x=x.replace(""+x.charAt(j), "ABC");
				}
		}
		System.out.println("ABC instead of Lowercase Vowels in this string: "+x);
	}
}