import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();

		HalfString hs = new HalfString(); 
		String res=hs.getHalfString(str);

		System.out.println("First Half of the string is: "+res);
	}
}

class HalfString{

	String getHalfString(String x) {

		String str1="";
		for(int j=0;j<=x.length()/2;j++) {
				str1=str1+x.charAt(j);
		}
		return str1;
	}
}