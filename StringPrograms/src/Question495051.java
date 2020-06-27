import java.util.Scanner;

public class Question495051 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();
		CountUCLCcons ccons = new CountUCLCcons(); 
		ccons.getCountUCLCcons(str);
	}

}

class CountUCLCcons{

	void getCountUCLCcons(String x) {
		
		String s="";
		String t="";
		String u="";
		for(int j=0;j<x.length();j++) {
			if(x.charAt(j)=='a'||x.charAt(j)=='e'||x.charAt(j)=='i'||x.charAt(j)=='o'||x.charAt(j)=='u' &&  x.charAt(j)=='A'||x.charAt(j)=='E'||x.charAt(j)=='I'||x.charAt(j)=='O'||x.charAt(j)=='U') {
				;
			}
			else if(x.charAt(j)>='a' && x.charAt(j)<='z') {
				s=s+x.charAt(j);
			}
			else if(x.charAt(j)>'A' && x.charAt(j)<='Z'){
				t=t+x.charAt(j);
			}
			else if(x.charAt(j)>='0' && x.charAt(j)<='9') {
				;
			}
			else {
				u=u+x.charAt(j);
			}
		}
		System.out.println("Number of LowerCase Consonants in this string are: "+s);
		System.out.println("Number of UpperCase Consonants in this string are: "+t);
		System.out.println("Number of Special Characters in this string are: "+u);
	}
}