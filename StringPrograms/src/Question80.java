import java.util.Scanner;

public class Question80 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();
		ABCinFrontNum abcnum = new ABCinFrontNum(); 
		abcnum.getABCinFrontNum(str);
	}

}

class ABCinFrontNum{

	void getABCinFrontNum(String x) {

		String s="";
		for(int j=0;j<x.length();j++) {
			if(x.charAt(j)>='0' && x.charAt(j)<='9') {
				s+=" ABC "+x.charAt(j);
			}
			else {
				s+=x.charAt(j);				
			}
		}
		System.out.println("ABC in front of Numeric Characters in this string: \n"+s);
	}
}