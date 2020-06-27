import java.util.Scanner;

public class Question39 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();
		CountAlphanum can = new CountAlphanum(); 
		can.getCountAlphanum(str);
	}

}

class CountAlphanum{

	void getCountAlphanum(String x) {

		int alphanum=0;
		for(int j=0;j<x.length();j++) {
			if(x.charAt(j)>='a' && x.charAt(j)<='z' || x.charAt(j)>='A' && x.charAt(j)<='Z' || x.charAt(j)>='0' && x.charAt(j)<='9') {
				alphanum++;
			}
		}
		System.out.println("Number of AlphaNumeric Characters in this string are: "+alphanum);
	}
}