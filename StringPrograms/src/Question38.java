import java.util.Scanner;

public class Question38 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();
		CountAlpha ca = new CountAlpha(); 
		ca.getCountAlpha(str);
	}

}

class CountAlpha{

	void getCountAlpha(String x) {

		int alpha=0;
		for(int j=0;j<x.length();j++) {
			if(x.charAt(j)>='a' && x.charAt(j)<='z' || x.charAt(j)>='A' && x.charAt(j)<='Z') {
				alpha++;
			}
		}
		System.out.println("Number of Alpha Characters in this string are: "+alpha);
	}
}