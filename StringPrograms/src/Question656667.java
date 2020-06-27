import java.util.Scanner;

public class Question656667 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		scan.close();
		ABCUCLC cuclc = new ABCUCLC(); 
		cuclc.getABCUCLC(str);
		
	}

}

class ABCUCLC{
	
	void getABCUCLC(String x) {
		
		String s="";
		String t="";
		String u="";
		for(int j=0;j<x.length();j++) {
				if(x.charAt(j)>=97 && x.charAt(j)<=122) {
					s+=(x.replace(""+x.charAt(j), "ABC"))+"\n";
				}
				else if(x.charAt(j)>=65 && x.charAt(j)<=90) {
					t+=(x.replace(""+x.charAt(j), "ABC"))+"\n";
				}
				else if(x.charAt(j)>=48 && x.charAt(j)<=57){
					u+=(x.replace(""+x.charAt(j), "ABC"))+"\n";
				}
				else {
					;
				}
		}
		System.out.println("ABC instead of LowerCase Characters in this string are: \n"+s);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("ABC instead of UpperCase Characters in this string are: \n"+t);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("ABC instead of Numeric Characters in this string are: \n"+u);
		
		
	}
}