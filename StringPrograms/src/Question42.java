import java.util.Scanner;

public class Question42 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		scan.close();
		PrintVowels cvol = new PrintVowels(); 
		String str1=cvol.getPrintVowels(str.toLowerCase());
		System.out.println("Printing the Vowels in this string: "+str1);
		
	}

}

class PrintVowels{
	
	String getPrintVowels(String x) {
		String s="";
		for(int j=0;j<x.length();j++) {
				if(x.charAt(j)=='a'||x.charAt(j)=='e'||x.charAt(j)=='i'||x.charAt(j)=='o'||x.charAt(j)=='u') {
					s=s+x.charAt(j);
				}
		}
		return s;
	}
}