import java.util.Scanner;

public class Question45 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		scan.close();
		PrintNumericCase pnc = new PrintNumericCase(); 
		String str1=pnc.getPrintNumericCase(str);
		System.out.println("Printing the Numeric Characters in this string: "+str1);
		
	}

}

class PrintNumericCase{
	
	String getPrintNumericCase(String x) {
		String s="";
		for(int j=0;j<x.length();j++) {
				if(x.charAt(j)>='0' && x.charAt(j)<='9') {
					s=s+x.charAt(j);
				}
		}
		return s;
	}
}