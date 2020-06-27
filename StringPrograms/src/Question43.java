import java.util.Scanner;

public class Question43 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		scan.close();
		PrintLowerCase plc = new PrintLowerCase(); 
		String str1=plc.getPrintLowerCase(str);
		System.out.println("Printing the Lowercase alphabets in this string: "+str1);
		
	}

}

class PrintLowerCase{
	
	String getPrintLowerCase(String x) {
		String s="";
		for(int j=0;j<x.length();j++) {
				if(x.charAt(j)>='a' && x.charAt(j)<='z') {
					s=s+x.charAt(j);
				}
		}
		return s;
	}
}