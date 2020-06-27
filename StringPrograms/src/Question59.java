import java.util.Scanner;

public class Question59 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		str=str.replace('a', 'A');
		str=str.replace('e', 'E');
		str=str.replace('i', 'I');
		str=str.replace('o', 'O');
		str=str.replace('u', 'U');
		scan.close();
		System.out.println("All Vowels to UpperCase in this string: "+str);
	}

}