import java.util.Scanner;

public class Question717273 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();
		ABCUCLCcons ccons = new ABCUCLCcons(); 
		ccons.getABCUCLCcons(str);
	}

}

class ABCUCLCcons{

	void getABCUCLCcons(String x) {
		
		String s="";
		String t="";
		String u="";
		for(int j=0;j<x.length();j++) {
			if(x.charAt(j)=='a'||x.charAt(j)=='e'||x.charAt(j)=='i'||x.charAt(j)=='o'||x.charAt(j)=='u' &&  x.charAt(j)=='A'||x.charAt(j)=='E'||x.charAt(j)=='I'||x.charAt(j)=='O'||x.charAt(j)=='U') {
				;
			}
			else if(x.charAt(j)>='a' && x.charAt(j)<='z') {
				s+=x.replace(""+x.charAt(j), "ABC")+"\n";
			}
			else if(x.charAt(j)>'A' && x.charAt(j)<='Z'){
				t+=x.replace(""+x.charAt(j), "ABC")+"\n";
			}
			else if(x.charAt(j)>='0' && x.charAt(j)<='9') {
				;
			}
			else {
				u+=x.replace(""+x.charAt(j), "ABC")+"\n";
			}
		}
		System.out.println("ABC instead of LowerCase Consonants in this string: \n"+s);
		System.out.println("ABC instead of UpperCase Consonants in this string: \n"+t);
		System.out.println("ABC instead of Special Characters in this string: \n"+u);
	}
}