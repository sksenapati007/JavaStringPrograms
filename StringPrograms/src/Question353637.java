import java.util.Scanner;

public class Question353637 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();
		CountUCLCConso cconso = new CountUCLCConso(); 
		cconso.getCountUCLCConso(str);
	}

}

class CountUCLCConso{

	void getCountUCLCConso(String x) {

		int uccount=0,lccount=0,specialc=0;
		for(int j=0;j<x.length();j++) {
			if(x.charAt(j)=='a'||x.charAt(j)=='e'||x.charAt(j)=='i'||x.charAt(j)=='o'||x.charAt(j)=='u' &&  x.charAt(j)=='A'||x.charAt(j)=='E'||x.charAt(j)=='I'||x.charAt(j)=='O'||x.charAt(j)=='U') {
				;
			}
			else if(x.charAt(j)>='a' && x.charAt(j)<='z') {
				lccount++;
			}
			else if(x.charAt(j)>='A' && x.charAt(j)<='Z'){
				uccount++;
			}
			else if(x.charAt(j)>='0' && x.charAt(j)<='9') {
				;
			}
			else {
				specialc++;
			}
		}
		System.out.println("Number of LowerCase Consonants in this string are: "+lccount);
		System.out.println("Number of UpperCase Consonants in this string are: "+uccount);
		System.out.println("Number of Special Characters in this string are: "+specialc);
	}
}