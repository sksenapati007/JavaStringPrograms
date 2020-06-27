import java.util.Scanner;

public class Question78 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();
		ABCinFrontlC abclc = new ABCinFrontlC(); 
		abclc.getABCinFrontlC(str);
	}

}

class ABCinFrontlC{

	void getABCinFrontlC(String x) {

		String s="";
		for(int j=0;j<x.length();j++) {
			if(x.charAt(j)>='A' && x.charAt(j)<='Z') {
				s+=x.charAt(j);				
			}
			else {
				s+=" ABC "+x.charAt(j);
			}
		}
		System.out.println("ABC in front of Lowercase Characters in this string: \n"+s);
	}
}