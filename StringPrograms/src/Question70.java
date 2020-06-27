import java.util.Scanner;

public class Question70 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		scan.close();
		ABCUCVowels cvol = new ABCUCVowels(); 
		cvol.getABCUCVowels(str);
	}

}

class ABCUCVowels{
	
	void getABCUCVowels(String x) {
		
		for(int j=0;j<x.length();j++) {
				if(x.charAt(j)=='A'||x.charAt(j)=='E'||x.charAt(j)=='I'||x.charAt(j)=='O'||x.charAt(j)=='U') {
					x=x.replace(""+x.charAt(j), "ABC");
				}
		}
		System.out.println("ABC instead of UpperCase Vowels in this string: "+x);
	}
}