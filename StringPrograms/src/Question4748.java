import java.util.Scanner;

public class Question4748 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();
		CountUCLCVow cvows = new CountUCLCVow(); 
		cvows.getCountUCLCVow(str);
	}

}

class CountUCLCVow{

	void getCountUCLCVow(String x) {
		
		String s="";
		String t="";
		for(int j=0;j<x.length();j++) {
			if(x.charAt(j)=='a'||x.charAt(j)=='e'||x.charAt(j)=='i'||x.charAt(j)=='o'||x.charAt(j)=='u') {
				s=s+x.charAt(j);
			}
			if(x.charAt(j)=='A'||x.charAt(j)=='E'||x.charAt(j)=='I'||x.charAt(j)=='O'||x.charAt(j)=='U') {
				t=t+x.charAt(j);
			}
		}
		System.out.println("Number of LowerCase Vowels in this string are: "+s);
		System.out.println("Number of UpperCase Vowels in this string are: "+t);
	}
}