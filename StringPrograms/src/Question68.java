import java.util.Scanner;

public class Question68 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		scan.close();
		ABCConso ccons = new ABCConso(); 
		ccons.getABCConso(str.toLowerCase());
		
	}

}

class ABCConso{
	
	void getABCConso(String x) {
		
		String s="";
		for(int j=0;j<x.length();j++) {
				if(x.charAt(j)=='a'||x.charAt(j)=='e'||x.charAt(j)=='i'||x.charAt(j)=='o'||x.charAt(j)=='u') {
					;
				}
				else if(x.charAt(j)==' ') {
					;
				}
				else {
					s+=(x.replace(""+x.charAt(j), "ABC"))+"\n";
				}
		}
		System.out.println("ABC instead of Consonants in this string: \n"+s);
	}
}