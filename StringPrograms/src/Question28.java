import java.util.Scanner;

public class Question28 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		scan.close();
		CountVowels cvol = new CountVowels(); 
		int num=cvol.getCountVowels(str.toLowerCase());
		
		System.out.println("Number of Vowels in this string are: "+num);
		
	}

}

class CountVowels{
	
	int getCountVowels(String x) {
		
		int count=0;
		for(int j=0;j<x.length();j++) {
				if(x.charAt(j)=='a'||x.charAt(j)=='e'||x.charAt(j)=='i'||x.charAt(j)=='o'||x.charAt(j)=='u') {
					count++;
				}
		}
		return count;
	}
}