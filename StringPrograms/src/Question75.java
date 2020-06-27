import java.util.Scanner;

public class Question75 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();
		ABCAlphaNum can = new ABCAlphaNum(); 
		can.getABCAlphaNum(str);
	}

}

class ABCAlphaNum{

	void getABCAlphaNum(String x) {

		String s="";
		for(int j=0;j<x.length();j++) {
			if(x.charAt(j)>='a' && x.charAt(j)<='z' || x.charAt(j)>='A' && x.charAt(j)<='Z' || x.charAt(j)>='0' && x.charAt(j)<='9') {
				s+=(x.replace(""+x.charAt(j), "ABC"))+"\n";
			}
		}
		System.out.println("ABC instead of Alpha Characters in this string: \n"+s);
	}
}