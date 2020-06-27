import java.util.Scanner;

public class Question79 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();
		ABCinFrontuC abcuc = new ABCinFrontuC(); 
		abcuc.getABCinFrontuC(str);
	}

}

class ABCinFrontuC{

	void getABCinFrontuC(String x) {

		String s="";
		for(int j=0;j<x.length();j++) {
			if(x.charAt(j)>='a' && x.charAt(j)<='z') {
				s+=x.charAt(j);				
			}
			else {
				s+=" ABC "+x.charAt(j);
			}
		}
		System.out.println("ABC in front of Uppercase Characters in this string: \n"+s);
	}
}