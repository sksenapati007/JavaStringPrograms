import java.util.Scanner;

public class Question293031 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		scan.close();
		CountUCLC cuclc = new CountUCLC(); 
		cuclc.getCountUCLC(str);
		
	}

}

class CountUCLC{
	
	void getCountUCLC(String x) {
		
		int lcasecount=0,ucasecount=0,numericcount=0;
		for(int j=0;j<x.length();j++) {
				if(x.charAt(j)>=97 && x.charAt(j)<=122) {
					lcasecount++;
				}
				else if(x.charAt(j)>=65 && x.charAt(j)<=90) {
					ucasecount++;
				}
				else if(x.charAt(j)>=48 && x.charAt(j)<=57){
					numericcount++;
				}
				else {
					;
				}
		}
		System.out.println("Number of LowerCase Characters in this string are: "+lcasecount);
		System.out.println("Number of UpperCase Characters in this string are: "+ucasecount);
		System.out.println("Number of Numeric Characters in this string are: "+numericcount);
	}
}