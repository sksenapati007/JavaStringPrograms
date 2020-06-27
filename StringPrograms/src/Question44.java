import java.util.Scanner;

public class Question44 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		scan.close();
		PrintUpperCase plc = new PrintUpperCase(); 
		String str1=plc.getPrintUpperCase(str);
		System.out.println("Printing the Uppercase alphabets in this string: "+str1);
		
	}

}

class PrintUpperCase{
	
	String getPrintUpperCase(String x) {
		String s="";
		for(int j=0;j<x.length();j++) {
				if(x.charAt(j)>='A' && x.charAt(j)<='Z') {
					s=s+x.charAt(j);
				}
		}
		return s;
	}
}