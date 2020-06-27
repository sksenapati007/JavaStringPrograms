import java.util.Scanner;

public class Question46 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		scan.close();
		PrintConsonants pcon = new PrintConsonants(); 
		String str1=pcon.getPrintConsonants(str.toLowerCase());
		System.out.println("Printing the Consonants in this string: "+str1);
		
	}

}

class PrintConsonants{
	
	String getPrintConsonants(String x) {
		String s="";
		for(int j=0;j<x.length();j++) {
				if(x.charAt(j)=='a'||x.charAt(j)=='e'||x.charAt(j)=='i'||x.charAt(j)=='o'||x.charAt(j)=='u') {
					;
				}
				else {
					s=s+x.charAt(j);
				}
		}
		return s;
	}
}